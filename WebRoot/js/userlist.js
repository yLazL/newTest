var url='showUsers.do'
$(document).ready(function(){ 
	$('#searchfrm').form('clear');
	$('#userGrid').datagrid( {
		fit:true,
		nowrap: false,
		striped: true,
		collapsible : false,
		url :url, 
		remoteSort: false,
		title:'用户管理',
//		pageNumber : 1,
//		pageSize : 20,
		columns : [[ 
			{field : 'userID',title : '用户ID', align : 'left',width :40,checkbox:true},
			{field : 'name',title : '姓名', align : 'left',width : 180},
			{field : 'accountNo',title : '账号', align : 'left',width : 180},
			{field : 'password',title : '密码', align : 'left',width : 180},
			{field : 'email',title : '邮箱', align : 'left',width : 200},
			{field : 'phone',title : '电话', align : 'left',width : 200}
		]],
		pagination:true,
		rownumbers:true,
		singleSelect : true,
		pageList : [4, 8, 16], 
		toolbar:[{  
            text:'新增',  
            iconCls:'icon-add',  
            handler:  Open_AddDialog
       
        },{  
            text:'删除',  
            iconCls:'icon-no',  
            handler:function(){  
            	var post = $("#userGrid").datagrid("getSelected");
            	if(post!=null){
	                $.messager.confirm("删除","确定删除？",function (data) {
	                    if (data) {                   	
	                    	
	                    	 $.ajax({  
	                             url:'removeUser.do?user.userID='+post.userID,    
	                             success:function(result){
	                            	 $.messager.show({msg:result,timeout:2500});
	                                 $('#userGrid').datagrid('reload');
	                             }  
	                         });  
	                    }
	                    
	                });
            	}else{
            		 $.messager.alert('提示', "请选择删除对象！","info");
            	}
            }  
        }, {  
            text:'修改',  
            iconCls:'icon-edit',  
            handler:function(){  
            	 var row=  $("#userGrid").datagrid("getSelected"); 
            	 if(row!==null){
            		
            		 Open_EditDialog(row);
            		 
            	 }else{
            		 $.messager.alert('提示', "请选择修改对象！","info");
            	 }
            }  
        },'-',{ 
            text:'search',  
            iconCls:'icon-search',  
            handler:function(){  
            	var name=$('#searchfrm #name').val();
            	var accountNo=$('#searchfrm #accountNo').val();            	
            	if(name==""&&accountNo=="")
            		$.messager.confirm('提示', "请输入查询条件");
            	else{
            		
            		$('#userGrid').datagrid("options").pageNumber=1
            		$('#userGrid').datagrid({'queryParams':{'user.name':name,'user.accountNo':accountNo}});
            		$('.datagrid-btn-separator').after(barHtml);
            	}
            }  
        }]  
	});    
	barHtml = $("#toolbar_search")[0].outerHTML;
	$('.datagrid-btn-separator').after(barHtml);
	
	$('.td_c #accountNo').focus(); //输入焦点
    $('.td_c #accountNo').keydown(function (event) {
        if (event.which == "13") {//回车键,移动光标到密码框
            $(".td_c #password").focus();
            $(".td_c #accountNo").trigger("blur");
        }
    });
    $('.td_c #accountNo').blur(function ()
    		{
    	if($('#addfrm #accountNo').attr("disabled")!="disabled"){
	    	$.ajax({  
	            url:'checkAccountNo.do?user.accountNo='+$('.td_c #accountNo').val(),  
	            type : "POST",
				dataType:"json",
	            success:function(obj){            	
	            	//var result = eval('('+result+')');            	
	            	if($('.td_c #accountNo').val()!="")
	           	 		$('#checkRes').html(obj.result);
	            	if(obj.result=="\"可用\""){
	            		$('#checkRes').css('color','green');
	            	}else{
	            		$('#checkRes').css('color','red');
	            	}
	            }  
	        });
    	}
    	else
    		alert($('#addfrm #accountNo').attr("disabled"));
    });
	
});
function Open_AddDialog() {
	$('#checkRes').html('');
	$('div').removeClass("validatebox-tip");
	$('#addfrm #accountNo').attr("disabled",false);
	$('#addfrm').form('clear');
	
	$('#adddlg').show();
	
	$('#adddlg').dialog({
	collapsible: true,
	minimizable: true,
	maximizable: true,
	title:'新增用户',
	buttons: [{
	text: '保存',
	iconCls: 'icon-ok',
	handler: function() {
		
		 $('#addfrm').form('submit',{
		        url: 'saveUser.do',
		        onSubmit: function(){
		          return $(this).form('validate');
		        },
		        success: function(result){
		          var result = eval('('+result+')');
		          if (result!=null){
		            $('#adddlg').dialog('close');		// close the dialog	
		            $('#userGrid').datagrid('reload');	// reload the user data
		            $.messager.show({msg:result,timeout:2500});
		          } else {
		        	  $.messager.confirm('提示', result);
		          }
		        }
		      });
	}
	}, {
	text: '取消',
	handler: function() {
		$('#adddlg').dialog('close');        
	}
	}]
	});
} 
function Open_EditDialog(row) {
	$('#checkRes').html('');
	 for(var attr in row){ 
		 $('#addfrm #'+attr).val(row[attr]);
	 }
	 $('#addfrm #accountNo').attr("disabled","disabled");
	$('#adddlg').show();
	
	$('#adddlg').dialog({
	collapsible: true,
	minimizable: true,
	maximizable: true,
	
	title:'修改用户信息',
	buttons: [{
	text: '保存',
	iconCls: 'icon-ok',
	handler: function() {
		
		 $('#addfrm').form('submit',{
		        url: 'modifyUser.do',
		        onSubmit: function(){
		          return $(this).form('validate');
		        },
		        success: function(result){
		          var result = eval('('+result+')');
		          if (result!=null){
		            $('#adddlg').dialog('close');		// close the dialog	
		            $('#userGrid').datagrid('reload');	// reload the user data
		            $.messager.show({msg:result,timeout:2500});
		          } else {
		        	  $.messager.confirm('提示', result);
		          }
		        }
		      });
	}
	}, {
	text: '取消',
	handler: function() {
		$('#adddlg').dialog('close');        
	}
	}]
	});
} 



