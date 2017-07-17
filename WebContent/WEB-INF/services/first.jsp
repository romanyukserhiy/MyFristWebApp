<html>
  <head>
    <meta charset="utf-8">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
    <title>My test page</title>
  </head>

 <div class="main">
      <div class="one">
        <div class="register">
          <h3>Input Form</h3>
          <form id="reg-form" method="post" action="/MyFirstWebApp/firstServlet">
            <div>
              <label for="name">First Name</label>
                  <input type="text" name="firstname" value="${requestScope.firstname}"><br><br>
            </div>
             <div>
              <label for="name">Last Name</label>
                  <input type="text" name="lastname" value="${requestScope.lastname}"> <br><br>
            </div>
            <div>
              <label for="email">Email</label>
              <input type="text" id="email" spellcheck="false" placeholder="example@xyz.com"/>
            </div>
            <div>
              <input type="radio" name="Male" value="male"> Male<br>
            </div>
            <div>
              <input type="radio" name="Female" value="female"> Female<br><br>
            </div>
             <div>
              <label></label>
              <input type="submit" value="Submit"/>
             </div>
          </form>
        </div>
      </div>
  </div>  

 