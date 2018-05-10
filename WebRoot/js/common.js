//定义一些每个页面都可能用到的全局变量
var activeMenu = "index";// 当前活动菜单

// fixme 无效
$(function() {
	// Some options to pass to the uploader are discussed on the next page
	/*
	 * var uploader = new qq.FineUploader({ element :
	 * document.getElementById("uploader"), request:{ endpoint:'/gdzc/upload' } })
	 */
});
// addEvent方法
$.fn.extend({
	addEvent : function(type, handle, bool) {
		var el, thisLen = this.length;
		bool ? bool = bool : bool = false;
		if (thisLen == 1) {
			el = this[0]; // jquery对象转成 js对象
			el.addEventListener ? el.addEventListener(type, handle, bool) : el
					.attachEvent('on' + type, handle);
		} else {
			for (var i = 0; i < thisLen; i++) {
				el = this[i];
				el.addEventListener ? el.addEventListener(type, handle, bool)
						: el.attachEvent('on' + type, handle);
			}
		}
	}
});
// load page
var loadPage = function(containerId, pageId) {
	$.ajax({
		url : "loadPage",
		data : {
			id : pageId
		},
		success : function(data) {
			$("#" + containerId).html(data)
		}
	})
};
//
var addLoadPageToClickEvent = function(selector) {
	$(selector).addEvent('click', function(e) {
		e.preventDefault();
		var id = e.target.id;
		loadPage("content", id)
	})
}
// 切换页签tab
var initTabSwitch = function() {
	$(".nav-item .nav-link").addEvent('click', function(e) {
		e.preventDefault();
		$(".nav-item .nav-link").removeClass("active");
		$(e.target).addClass("active");
		loadPage("myTabContent", e.target.id)
	})
}
// initTable
var initTable = function() {

	$("#bootstrap-table")
			.bootstrapTable(
					{
						classes : 'table table-striped table-sm',
						// url : '/Home/GetDepartment', //请求后台的URL（*）
						method : 'get', // 请求方式（*）
						toolbar : '#toolbar', // 工具按钮用哪个容器
						striped : true, // 是否显示行间隔色
						cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
						pagination : true, // 是否显示分页（*）
						sortable : false, // 是否启用排序
						sortOrder : "asc", // 排序方式
						// queryParams : oTableInit.queryParams,//传递参数（*）
						sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
						pageNumber : 1, // 初始化加载第一页，默认第一页
						pageSize : 10, // 每页的记录行数（*）
						pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
						search : false, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
						strictSearch : true,
						showColumns : false, // 是否显示可显示哪些列
						showRefresh : false, // 是否显示刷新按钮
						minimumCountColumns : 2, // 最少允许的列数
						clickToSelect : false, // 是否启用点击选中行
						uniqueId : "ID", // 每一行的唯一标识，一般为主键列
						showToggle : false, // 是否显示详细视图和列表视图的切换按钮
						cardView : false, // 是否显示详细视图
						detailView : false, // 是否显示父子表
						data : [ {
							id : 1,
							name : 'Item 1',
							price : '$1'
						}, {
							id : 2,
							name : 'Item 2',
							price : '$2'
						}, {
							id : 2,
							name : 'Item 2',
							price : '$2'
						}, {
							id : 2,
							name : 'Item 2',
							price : '$2'
						}, {
							id : 2,
							name : 'Item 2',
							price : '$2'
						}, {
							id : 2,
							name : 'Item 2',
							price : '$2'
						} ],
						columns : [
								{
									checkbox : false
								},
								{
									field : 'Name',
									title : '设备编号'
								},
								{
									field : 'ParentName',
									title : '设备名称'
								},
								{
									field : 'Level',
									title : '固定资产负责人'
								},
								{
									field : 'Desc',
									title : '操作',
									width : '120px',
									formatter : function(value, row, index) {
										var html = [];
										html
												.push("<button type='button' class='btn btn-sm btn-info' id='");
										html.push(activeMenu);
										html.push("-info'>查看</button>");
										html
												.push("<button type='button' class='btn btn-sm btn-danger'>删除</button>")
										return html.join("");
										// return '好';
									}
								}, ],
					})
};