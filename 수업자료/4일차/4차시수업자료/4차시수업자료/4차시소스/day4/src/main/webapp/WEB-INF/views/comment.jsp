<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>



<script>

function regComment(){
	alert("djdfjdkfd");
	
	
	//서버와 비동기통신 
	//화면전환없이 서버와 통신할 수 있다 .
	//jquery라이브러리 :    
		
     let title = $("#title").val();    // document.querySelector("#title").value ;
     let content  = $("#content").val();
     let id="c01";
     
     let sendDataJSon={ id: id , title:title , content: content};
     console.log(sendDataJSon);     
     let sendDataJsonString = JSON.stringify(sendDataJSon);
     console.log(sendDataJsonString);  
     
     
     // $.ajax();
     // $.ajax(   {  });
     $.ajax(  { 
    	 type: "POST", 
    	 url:"/day4/comments",
    	 data: sendDataJsonString ,
    	 contentType: "application/json",
    	 //콜백함수    	 
    	 success: function( data){  console.log( data);},
    	 error: function( err){ console.log( err);}
    	 
     } );  //호출 
}



// 리뷰수정 
function  modifyComment(){
	alert("dfjjdfkdf");
	
	
	//데이터구성해야한다
	let id= "c01";
	let title2= $("#title2").val();
	let content2 = $("#content2").val();
	
	//  let snak=  {  title:"맛동산" ,   price: "4800"  , success: function(){ alert("^^");}}
	//  snak.success();
	let data= { id: id, title : title2  , content : content2};	
	console.log( data);
	
	let dataString  =  JSON.stringify(data );   
	console.log( dataString);
	
	 
	//ajax통신한다
	$.ajax( {
		
		type:"PUT",
		url:"/day4/comments/"+id,   //   /day4/comments/c01       
		data: dataString, 
		contentType:"application/json",
		success: function( data){
			
			console.log( data);
			
			if( data =="1"){
				alert("변경되었습니다");
			}
		//	alert(" hi");
			
		},
		error: function( e){
			console.log(e);
		} 
	} );
	
	
}
///
function deleteComment(){
	alert("dfkdfkdf");	
	let id  = $("#id").val();
	
	$.ajax( {
		type:"DELETE",
		url:"/day4/comments/"+id ,
		success: function( data){
			console.log( data);
		},
		error: function( err){
			console.log( err);
		}
	});
	
}
///


function getComment(){
	//리뷰
	
	$.ajax( {
		type:"GET",
		url:"/day4/comments",
		success: function(data){
			console.log(data);
			
			
		},
		error: function( e){
			console.log(e);
		}
	});	
}


//한 개 조회 

function getCommentOne(){
	alert("gdgdkgdgdgdgd");
	// 리뷰id
	
	let id  = $("#id2").val();
	alert( id);
	
	//
	$.ajax( {
		type:"GET",
		url:"/day4/comments/"+id ,
		success: function( data){ 
			console.log( data);
		},
		error: function(e){
			console.log( e);
		}
	});
	 
}

</script>
</head>
<body>


<h2> 좋은 상품  상세페이지 입니다.   ~~~~~</h2>

<h2> 리뷰등록</h2> 
<input type="text" id="title">
<input type="text" id="content">
<button onclick="regComment()">등록</button>



<h2> 리뷰수정</h2>

<input type="text" id="title2">
<input type="text" id="content2">
<button onclick="modifyComment()">변경</button>


<h2> 리뷰삭제</h2>
<input type="text" id="id">
<button onclick="deleteComment()">삭제</button>


<h2> 리뷰조회</h2>
<button onclick="getComment()">전체조회</button>


<h2>리뷰 한 개 조회</h2>
<input type="text"  id="id2">
<button onclick="getCommentOne()">조회</button>


</body>
</html>