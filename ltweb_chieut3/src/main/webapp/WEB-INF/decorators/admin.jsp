<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Fonts START -->
<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700|PT+Sans+Narrow|Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900&amp;subset=all" rel="stylesheet" type="text/css">
<!--- fonts for slider on the index page -->
<!-- Fonts END -->

<!-- Global styles START -->
<link href="/ltweb_chieut3/assets/global/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/global/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Global styles END -->

<!-- Page level plugin styles START -->
<link href="/ltweb_chieut3/assets/global/plugins/fancybox/source/jquery.fancybox.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/global/plugins/carousel-owl-carousel/owl-carousel/owl.carousel.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/global/plugins/slider-layer-slider/css/layerslider.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/global/plugins/uniform/css/uniform.default.css" rel="stylesheet" type="text/css">
<!-- Page level plugin styles END -->

<!-- Theme styles START -->
<link href="/ltweb_chieut3/assets/global/css/components.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/frontend/layout/css/style.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/frontend/pages/css/style-shop.css" rel="stylesheet" type="text/css">
<link href="/ltweb_chieut3/assets/frontend/pages/css/style-layer-slider.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/frontend/layout/css/style-responsive.css" rel="stylesheet">
<link href="/ltweb_chieut3/assets/frontend/layout/css/themes/red.css" rel="stylesheet" id="style-color">
<link href="/ltweb_chieut3/assets/frontend/layout/css/custom.css" rel="stylesheet">
<!-- BEGIN PAGE LEVEL STYLES -->
<link rel="stylesheet" type="text/css" href="/ltweb_chieut3/assets/global/plugins/select2/select2.css"/>
<link rel="stylesheet" type="text/css" href="/ltweb_chieut3/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css"/>
<!-- END PAGE LEVEL STYLES -->
</head>
<body>
<body>
	
	<sitemesh:write property = "body" />
	
	
	<script src="/ltweb_chieut3/assets/global/plugins/jquery.min.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/global/plugins/jquery-migrate.min.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/global/plugins/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/frontend/layout/scripts/back-to-top.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js" type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="/ltweb_chieut3/assets/global/plugins/select2/select2.min.js"></script>
	<script type="text/javascript" src="/ltweb_chieut3/assets/global/plugins/datatables/media/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="/ltweb_chieut3/assets/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<script src="/ltweb_chieut3/assets/frontend/layout/scripts/layout.js"
		type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/admin/layout2/scripts/demo.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/global/scripts/metronic.js" type="text/javascript"></script>
	<script src="/ltweb_chieut3/assets/admin/pages/scripts/table-managed.js"></script>
	
	<script>
		jQuery(document).ready(function() {       
		   Metronic.init(); // init metronic core components
			Layout.init(); // init current layout
			Demo.init(); // init demo features
		   	TableManaged.init();
			EcommerceIndex.init();
		});
	</script>
</body>
</body>
</html>