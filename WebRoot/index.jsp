<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
   <title>Home</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
</script>
  </head>
  
  <body>
    <div class="header">
		<div class="container">		 
		<div class="header_bottom">
		  <div class="header_nav">
      		<div class="logo">
				<a href="index.html"><img src="images/logo.png" alt=""/><br></a>
			 </div>
			 <nav class="navbar navbar-default menu" role="navigation"><h3 class="nav_right"><a href="index.html"><img src="images/logo.png" class="img-responsive" alt=""/></a></h3>
			  <div class="container-fluid">
			    <!-- Brand and toggle get grouped for better mobile display -->
			    <div class="navbar-header">
			      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			      </button>
			    </div>
				<!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			      <ul class="nav navbar-nav menu1">
			      	<li class="active"><a href="index.html">Specials</a></li>
			        <li><a href="fruits.html">Fruits & Veg</a></li>
			        <li><a href="products.html">Food Products</a></li>
			        <li><a href="store.html">Locate Store</a></li>
			         <li><a href="club.html">Fan Club</a></li>
			        <li><a href="contact.html">Contact</a></li>
		          </ul>
		       
			      <div class="clearfix"></div>
			    </div><!-- /.navbar-collapse -->
			  </div><!-- /.container-fluid -->
			</nav>
            <div class="clearfix"></div>
           </div>
            <div class="search">
			  <input type="text" class="text" value="Enter Product Details" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Product Details';}">
			  <input type="submit" value="Search">
			</div>
		 </div>  
		</div>
	</div>
    <div class="main">
		<div class="container">
		   <div class="banner">
			 <img src="images/banner.jpg" class="img-responsive" alt=""/>
		   </div>
		    <div class="col-md-12 col-xs-12 col-sm-12">
		   	   <ul class="feature">
		   	   	 <h3><i class="arrow"> </i><span>今日推荐</span></h3>
		   	   </ul>
		   	   <div class="feature_grid ">
				 <div class="grid1 col-xs-12 col-md-12"><img src="http://img.alicdn.com/bao/uploaded/i1/TB1ySeWfhOMSKJjSZFlYXFqQFXa_M2.SS2" class="img-responsive" alt=""/>
				 	<p>是是是是是是所所所所所所所所所所所所所所所所</p>
				 	<div class="price">卷后价:
					  <span class="actual">￥84</span>
					</div>
				    <div class="but1">
			          <a href="https://uland.taobao.com/coupon/edetail?e=0OPUK%2F2IxpsN%2BoQUE6FNzAKjmIzasHi%2FDCvw1LpxWK8RR4i0yJakS8fbOtxePYU60vjViID1HOrsYHzU5uHxCXz%2F5lYwoL5IC0DytI6FkgRyfrAT402Yx%2FYqd%2BZ%2Bw%2F39ObtDDT3luyzv59gnfBK8RDuJCHTMl99j&pid=mm_127253564_38470687_142214797&af=1">领卷购买</a>
			        </div>
				 </div>		   	   	
				<!--  <div class="grid1 col-xs-3 col-md-3 col-sm-3"><img src="http://img.alicdn.com/bao/uploaded/i1/TB1ySeWfhOMSKJjSZFlYXFqQFXa_M2.SS2" class="img-responsive" alt=""/>
				 	<p>是是是是是是所所所所所所所所所所所所所所所所</p>
				 	<div class="price">卷后价:
					  <span class="actual">￥84</span>
					</div>
				    <div class="but1">
			          <a href="https://uland.taobao.com/coupon/edetail?e=0OPUK%2F2IxpsN%2BoQUE6FNzAKjmIzasHi%2FDCvw1LpxWK8RR4i0yJakS8fbOtxePYU60vjViID1HOrsYHzU5uHxCXz%2F5lYwoL5IC0DytI6FkgRyfrAT402Yx%2FYqd%2BZ%2Bw%2F39ObtDDT3luyzv59gnfBK8RDuJCHTMl99j&pid=mm_127253564_38470687_142214797&af=1">领卷购买</a>
			        </div>
				 </div>
				 <div class="grid1 col-xs-3 col-md-3"><img src="http://img.alicdn.com/bao/uploaded/i1/TB1ySeWfhOMSKJjSZFlYXFqQFXa_M2.SS2" class="img-responsive" alt=""/>
				 	<p>是是是是是是所所所所所所所所所所所所所所所所</p>
				 	<div class="price">卷后价:
					  <span class="actual">￥84</span>
					</div>
				    <div class="but1">
			          <a href="https://uland.taobao.com/coupon/edetail?e=0OPUK%2F2IxpsN%2BoQUE6FNzAKjmIzasHi%2FDCvw1LpxWK8RR4i0yJakS8fbOtxePYU60vjViID1HOrsYHzU5uHxCXz%2F5lYwoL5IC0DytI6FkgRyfrAT402Yx%2FYqd%2BZ%2Bw%2F39ObtDDT3luyzv59gnfBK8RDuJCHTMl99j&pid=mm_127253564_38470687_142214797&af=1">领卷购买</a>
			        </div>
				 </div>
				 <div class="grid1 col-xs-3 col-md-3"><img src="http://img.alicdn.com/bao/uploaded/i1/TB1ySeWfhOMSKJjSZFlYXFqQFXa_M2.SS2" class="img-responsive" alt=""/>
				 	<p>是是是是是是所所所所所所所所所所所所所所所所</p>
				 	<div class="price">卷后价:
					  <span class="actual">￥84</span>
					</div>
				    <div class="but1">
			          <a href="https://uland.taobao.com/coupon/edetail?e=0OPUK%2F2IxpsN%2BoQUE6FNzAKjmIzasHi%2FDCvw1LpxWK8RR4i0yJakS8fbOtxePYU60vjViID1HOrsYHzU5uHxCXz%2F5lYwoL5IC0DytI6FkgRyfrAT402Yx%2FYqd%2BZ%2Bw%2F39ObtDDT3luyzv59gnfBK8RDuJCHTMl99j&pid=mm_127253564_38470687_142214797&af=1">领卷购买</a>
			        </div>
				 </div> -->
				 <div class="clearfix"> </div>
		   	   </div>
		   	    <ul class="feature">
		   	   	 <h3><i class="arrow"> </i><span>Popular products</span></h3>
		   	   </ul>
		   	   <div class="row content_bottom">
			   	   <div class="col-xs-3 col-md-3">
			   	   	<div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p1.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">卷后价:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	  <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p4.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	 <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p3.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	   <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p2.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   </div>
			   <div class="row content_bottom1">
			   	   <div class="col-xs-3 col-md-3">
			   	   	<div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p8.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	  <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p7.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	  <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p6.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   	   <div class="col-xs-3 col-md-3">
			   	   	   <div class="content_box"><a href="single.html">
			   	   	  	<div class="view view-fifth">
			   	   	     <img src="images/p5.jpg" class="img-responsive" alt=""/>
				   	   	 <div class="content_box-grid">
				   	   	  <p class="m_1">Lorem ipsum dolor sit amet, consectetuer adipiscing elit</p>
				   	   	  <div class="price">Price:
						    <span class="actual">￥84</span>
						  </div>
						  <ul class="product_but">
						  	<li class="but3">领卷购买</li>
						  	<li class="like"><span>120</span><i class="like1"> </i></li>
						  	<div class="clearfix"> </div>
						  </ul>
						   <div class="mask">
	                         <div class="info">Quick View</div>
			               </div>
			             </div>
				   	   	</div>
			   	   	   </a>
			   	   	  </div>
			   	   </div>
			   </div>
			   <ul class="dc_pagination dc_paginationA dc_paginationA06">
				  <li><a href="#">1</a></li>
				  <li><a href="#" class="current">2</a></li>
				  <li><a href="#">3</a></li>
				  <li><a href="#">4</a></li>
				  <li><a href="#">5</a></li>
				  <li><a href="#">...</a></li>
				  <li><a href="#">19</a></li>
				  <li><a href="#">20</a></li>
				  <li><a href="#" class="previous">Next></a></li>
				  <li><a href="#" class="next">Last>></a></li>
		       </ul>
		    </div>
		   </div>
		</div>
	</div>
	<div class="footer">
		<div class="container">
			<div class="footer-grid footer-grid1">
			  <h3 class="m_2">Company</h3>
			  <ul class="list1">
			  	<li><a href="#">Home</a></li>
			    <li><a href="#">About Us</a></li>
			    <li><a href="#">Blog</a></li>
			    <li><a href="#">Latest News</a></li>
			    <li><a href="#">Login</a></li>
			    <li><a href="#">Join Us</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid2">
			  <h3 class="m_2">Company</h3>
			  <ul class="list1">
			  	<li><a href="#">Lorem ipsum dolor sit amet</a></li>
			    <li><a href="#">diam nonummy nibh euismod</a></li>
			    <li><a href="#">nostrud exerci tation</a></li>
			    <li><a href="#">hendrerit in vulputate velit</a></li>
			    <li><a href="#">soluta nobis eleifend option</a></li>
			    <li><a href="#">dynamicus, qui sequitur</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid3">
			  <h3 class="m_2">Information</h3>
			  <ul class="list1">
			  	<li><a href="#">My Account</a></li>
			    <li><a href="#">Rewards</a></li>
			    <li><a href="#">Terms & Conditions</a></li>
			    <li><a href="#">领卷购买ing Guide</a></li>
			    <li><a href="#">FAQ</a></li>
			  </ul>
		   </div>
		   <div class="footer-grid footer-grid4">
			   <h3 class="m_2">Let's be friends</h3>
			   <ul class="footer_social">
				 <li><a href=""> <i class="tw"> </i> </a></li>
				 <li><a href=""><i class="fb"> </i> </a></li>
				 <li><a href=""><i class="rss"> </i> </a></li>
				 <li><a href=""><i class="msg"> </i> </a></li>
				 <div class="clearfix"> </div>
			   </ul>
			   <h3 class="m_3">Subscribe</h3>
			   <p class="m_4">aliquam erat volutpat. Ut wisi</p>
			   <div class="footer_search">
			    <input type="text" class="text" value="Enter Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Enter Email';}">
			    <input type="submit" value="Search">
			   </div>
		   </div>
		   <div class="footer-grid footer-grid_last">
	          <ul class="secure">
			  	<li class="secure_img"><img src="images/secure.png" alt=""/></li> 
			  	<li class="secure_desc">Lorem ipsum dolor coadipiscing</li>
			  	<div class="clearfix"> </div>
			  </ul>
			  <ul class="secure">
			  	<li class="secure_img"><img src="images/order.png" alt=""/></li> 
			  	<li class="secure_desc">Lorem ipsum dolor coadipiscing</li>
			  	<div class="clearfix"> </div>
			 </ul>
		   </div>
		   <div class="clearfix"> </div>
		   <div class="copy">
		    <p>Copyright &copy; 2014.Company name All rights reserved.<a target="_blank" href="http://sc.chinaz.com/moban/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
		</div>
	   </div>
	</div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
