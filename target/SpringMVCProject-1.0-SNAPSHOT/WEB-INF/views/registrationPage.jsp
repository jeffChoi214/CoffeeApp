<%--
  Created by IntelliJ IDEA.
  User: hyunchoi
  Date: 2/28/17
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<div class="container">
    <div class="jumbotron" style="background:url(http://az616578.vo.msecnd.net/files/2016/05/05/635980743690830477-989314837_12324367965_35eef6a11c_o.jpg);
                                          background-position: 0% 25%;
                                          background-size: cover;
                                          background-repeat: no-repeat;
                                          color: white;
                                          text-shadow: black 0.3em 0.3em 0.3em;
                                          height: 100vh;">
        <div class = "container">
            <div class="wrapper" style="margin-top: 80px;
                                     margin-bottom: 20px;">
                <form action="registered" method="post" name="register" class="form-signin" style="max-width: 420px;
                              padding: 30px 38px 66px;
                              margin: 0 auto;
                              background-color: #eee;
                              border: 3px dotted rgba(0,0,0,0.1);
                              background-color:rgba(0, 0, 0, 0.6);
                                ">
                    <h3 class="form-signin-heading" style="text-align:center;
                                                          margin-bottom: 30px;">
                        Registration</h3>
                    <hr class="colorgraph" style="height: 7px;
                      border-top: 0;
                      background: #c4e17f;
                      border-radius: 5px;
                      background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                      background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                      background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                      background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
                        "><br>
                    <input type="text" class="form-control" name="UserName" placeholder="Username" required="" autofocus="" style="position: relative;
                                  font-size: 16px;
                                  height: auto;
                                  padding: 10px;
                                  margin-bottom: 0px;
                                  border-bottom-left-radius: 0;
                                  border-bottom-right-radius: 0;"/>
                    <input type="text" class="form-control" name="FName" placeholder="First Name" required="" autofocus="" style="position: relative;
                                  font-size: 16px;
                                  height: auto;
                                  padding: 10px;
                                  margin-bottom: 0px;
                                  border-bottom-left-radius: 0;
                                  border-bottom-right-radius: 0;"/>
                    <input type="text" class="form-control" name="LName" placeholder="Last Name" required=""
                           style="position: relative;
                            font-size: 16px;
                            height: auto;
                            padding: 10px;
                            margin-bottom: 0px;
                            border-top-left-radius: 0;
                            border-top-right-radius: 0; "
                    />
                    <input type="text" class="form-control" name="dob" placeholder="DoB" required=""
                           style="position: relative;
                            font-size: 16px;
                            height: auto;
                            padding: 10px;
                            margin-bottom: 0px;
                            border-top-left-radius: 0;
                            border-top-right-radius: 0; "
                    />
                    <input type="password" class="form-control" name="Password" placeholder="Password" required=""
                           style="position: relative;
                            font-size: 16px;
                            height: auto;
                            padding: 10px;
                            margin-bottom: 20px;
                            border-top-left-radius: 0;
                            border-top-right-radius: 0; "
                    />
                    <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit" action="registered">Register</button>
                    <div class="text-center"><a href="/"><h3><b>Go Back</b></h3></a></div>
                </form>


    </div>
</div>

</body>
</html>
