$(function(){
	$('.obtn').click(function(){
		var no = $(this).parents().parents().attr('id');
		alert(no);
		$('#no').val(no);
		$('#frm').attr('action','/YummyMap/admin/remember.mmy');
		$('#frm').submit();
	});
	
	$('.pbtn').click(function(){
		let page = $(this).text();
		let sel =	$('#opt').val();
		let scname = $('#search-input').val();
		$('#searchs').val(scname);
		$('#opts').val(sel);
		$('#nowpage').val(page);
		$('#frm').attr('action','/YummyMap/admin/main.mmy');
		$('#frm').submit();
		
	});
	
	$('#sbtn').click(function(){
		let sel =	$('#opt').val();
		var scname = $('#search-input').val();
		if(sel != 'nos' && !scname){
			alert('검색어를 입력하세요 ! ');
			$('#search-input').focus();
			return;
		}
		
		$('#searchs').val(scname);
		$('#opts').val(sel);
		$('#frm').attr('action','/YummyMap/admin/main.mmy');
		$('#frm').submit();
	});
	
	$('.rbtn').click(function(){
		var id = $(this).parents().prevAll('.mid').text();
		$('.modal-body').html('<b>'+id+'</b> 해당 계정을 정말 삭제 하시겠습니까? ');
	});
});