$(document).ready(function(){ 
	$('#loginfrm').form('clear');
	$('#logindlg').show();	
	$('#logindlg').dialog({
	collapsible: false,
	minimizable: false,
	maximizable: false,
	 onClose:function(){
		 
		 $.messager.confirm("提示","离开登录界面？",function (data) {
             if (data) {                   	
             	
            	 window.open('about:blank','_self');
            	 window.close();
             }else{
            	 location.reload();
             }
             
         });
	 },
	title:'用户登录',
	buttons: [{
	text: '登录',
	iconCls: 'icon-ok',
	
	handler: function() {
		
		 $('#loginfrm').form('submit',{
		        url: 'login/check.do',
		        onSubmit: function(){
		          return $(this).form('validate');
		        },
		        success: function(result){		        	
		          var result = eval('('+result+')');
		          
		          if (result=="\"login...\""){	
		        	
		            
		            location.href ='user/toMainPage.do';
		            
		          } else {
		        	  $.messager.confirm('提示', result);
		          }
		        }
		      });
	}
	}, {
	text: '重置',
	iconCls: 'icon-redo',
	handler: function() {
		$('#loginfrm').form("clear");        
	}
	}]
	});
});