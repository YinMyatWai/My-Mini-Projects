<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- Font Awesome -->
    <link
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
    rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
    href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
    rel="stylesheet"
    />
    <!-- MDB -->
    <link
    href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
    rel="stylesheet"
    />
</head>
<body class="bg-dark">
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
                <div class="bg-danger text-white text-center p-2" style="border-radius:5px;">
                    <b class="fs-5">Logout Successful!</b>
                </div>
            </div>
        </div>
    </div>
</body>
</html>