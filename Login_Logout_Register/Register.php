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

        $errorName = $errorEmail = $errorPassword = $errorConfirmPassword = "";

        function checkStrongPassword($password){
            $upperStatus = false;
            $lowerStatus = false;
            $numberStatus = false;
            $specialStatus = false;

            if(preg_match("/[A-Z]/", $password)){
                $upperStatus = true;
            }
            if(preg_match("/[a-z]/", $password)){
                $lowerStatus = true;
            }
            if(preg_match("/[0-9]/", $password)){
                $numberStatus = true;
            }
            if(preg_match("/[!@#$%^&*]/", $password)){
                $specialStatus = true;
            }

            if($upperStatus && $lowerStatus && $numberStatus && $specialStatus){
                return true;
            }else{
                return false;
            }

        }

        if(isset($_POST['register'])){
            $name = $_POST['name'];
            $email = $_POST['email'];
            $password = $_POST['password'];
            $confirmPassword = $_POST['confirmPassword'];

            if($_POST['name'] == null || $_POST['name'] == "" || empty($_POST['name'])){
                $errorName = "Please fill your name!";
            }

            if($_POST['email'] == null || $_POST['email'] == "" || empty($_POST['email'])){
                $errorEmail = "Please fill your email!";
            }

            if($_POST['password'] == null || $_POST['password'] == "" || empty($_POST['password'])){
                $errorPassword = "Please fill your password!";
            }

            if($_POST['confirmPassword'] == null || $_POST['confirmPassword'] == "" || empty($_POST['confirmPassword'])){
                $errorConfirmPassword = "Please fill your confirm Password!";
            }

            if($name != "" && $email != "" && $password != "" && $confirmPassword != ""){
                if(strlen($password) >=6 && strlen($confirmPassword) >= 6){
                    if($password == $confirmPassword){
                        $status = checkStrongPassword($password);

                        if($status){
                            $_SESSION['email'] = $email;
                            $_SESSION['password'] = password_hash("$password",PASSWORD_BCRYPT);

                            echo "Register Successful...";
                        }else{
                            echo "Your password is not strong password! Must contain A-Z a-z 0-9 !@#$%^&";
                        }
                    }else{
                    echo "Not same password!Type agin!";
                    }
                }else{
                    echo "Password must be greater than 6!";
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
                            <h4>Register</h4>
                        </div>
                        <form action="" method="POST">
                            <div class="mb-3">
                                <label for="name">Name</label>
                                <input type="text" name="name" id="name" class="form-control">
                                <small class="text-danger"><?php  echo $errorName ?></small>
                            </div>
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
                            <div class="mb-3">
                                <label for="confirm password">Confirm Password</label>
                                <input type="password" name="confirmPassword" id="confirm password"
                                    class="form-control">
                                <small class="text-danger"><?php  echo $errorConfirmPassword ?></small>
                            </div>
                            <button type="submit" class="btn bg-success text-white float-end"
                                name="register">Register</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>


</body>

</html>