<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>

<form action="${pageContext.request.contextPath }/admin/category/update" method ="post" enctype="multipart/form-data">
  <input type="text" name ="categoryid" value="${cate.categoryid}" hidden="hidden"> 
  <label for="categoryname">Category name:</label><br>
  <input type="text" id="categoryname" name="categoryname" value="${cate.categoryname}"> value<br>
  
  <label for="lname">Link Images:</label><br>
  <input type="text" id="images" name="images" value="${cate.images}"><br>
  
  				<c:if test="${cate.images.substring(0,5) != 'https' }">
					<c:url value="/image?fname=${cate.images }" var="imgUrl"></c:url>
				</c:if> 
				<c:if test="${cate.images.substring(0,5) == 'https' }">
					<c:url value="${cate.images }" var="imgUrl"></c:url>
				</c:if>
				<img height="150" width="200" src="${imgUrl}" />
				
				
  <label for="lname">Upload Images:</label><br>
  <input type="file" id="images1" name="images1" ${cate.images}><br>
  
  <label for="status">Status:</label><br>
  <input type="radio" id="ston" name="status" value="1" ${cate.status==1?'checked' : '' }><br>
   <label for="css">Hoạt động</label><br>
  <input type="radio" id="stoff" name="status" value="0" ${cate.status==1?'checked' : '' }><br>
  <label for="javascript">Khóa</label>
  
  <br><br>
  <input type="submit" value="Insert">
</form> 