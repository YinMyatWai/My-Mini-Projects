<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet" />
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet" />
    <!-- MDB -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css" rel="stylesheet" />
</head>

<body class="bg-dark">

    <?php
        session_start();

        $errorEmail = $errorPassword = "";

        if(isset($_POST['loginBtn'])){
            $userEmail = $_POST['email'];
            $userPassword = $_POST['password'];

            
            if($_POST['email'] == null || $_POST['email'] == "" || empty($_POST['email'])){
                $errorEmail = "Please fill your email!";
            }

            if($_POST['password'] == null || $_POST['password'] == "" || empty($_POST['password'])){
                $errorPassword = "Please fill your password!";
            }

            if($userEmail != "" || $userPassword != ""){
                if($userEmail == $_SESSION['email'] && password_verify($userPassword, $_SESSION['password'])){
                    echo "Login Successful...";
                }else{
                    echo "Login Fail!!!";
                }
            }
            
        }
    ?>


    <div class="container mt-4">
        <div class="row">
            <div class="col-3">
                <div class="text-center">
                    <a href="Login.php">
                        <button class="btn bg-primary text-white mb-3" style="width:100px;">Login</button>
                    </a>
                </div>
                <div class="text-center">
                    <a href="Register.php">
                        <button class="btn bg-success text-white mb-3" style="width:100px;">Register</button>
                    </a>
                </div>
                <div class="text-center">
                    <a href="Logout.php">
                        <button class="btn bg-danger text-white mb-3" style="width:100px;">Logout</button>
                    </a>
                </div>
            </div>
            <div class="col-8">
                <div class="card">
                    <div class="card-body">
                        <div class="text-center">
                            <h4>Login</h4>
                        </div>
                        <form action="" method="POST">
                            <div class="mb-3">
                                <label for="email">Email</label>
                                <input type="email" name="email" id="email" class="form-control">
                                <small class="text-danger"><?php  echo $errorEmail ?></small>
                            </div>
                            <div class="mb-3">
                                <label for="password">Password</label>
                                <input type="password" name="password" id="password" class="form-control">
                                <small class="text-danger"><?php  echo $errorPassword ?></small>
                            </div>
                            <button type="submit" class="btn bg-primary text-white float-end"
                                name="loginBtn">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>

</html>