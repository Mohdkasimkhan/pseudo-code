CLASS User
    ATTRIBUTES:
        username
        password
    
    METHOD login(inputUsername, inputPassword):
        IF inputUsername == username AND inputPassword == password
            RETURN true
        ELSE
            RETURN false
END CLASS


CLASS Student EXTENDS User
    ATTRIBUTES:
        isEnrolled  // boolean

    METHOD login(inputUsername, inputPassword):
        IF super.login(inputUsername, inputPassword) == true AND isEnrolled == true
            PRINT "Student logged in successfully. Exams available!"
            RETURN true
        ELSE
            PRINT "Student login failed. Invalid credentials or not enrolled."
            RETURN false
END CLASS


CLASS Admin EXTENDS User
    ATTRIBUTES:
        isAdmin  // boolean

    METHOD login(inputUsername, inputPassword):
        IF super.login(inputUsername, inputPassword) == true AND isAdmin == true
            PRINT "Admin logged in successfully. Exam management tools available!"
            RETURN true
        ELSE
            PRINT "Admin login failed. Invalid credentials or not admin."
            RETURN false
END CLASS


MAIN PROGRAM:
    CREATE Student object with username="john123", password="pass123", isEnrolled=true
    CREATE Admin object with username="admin1", password="adminpass", isAdmin=true

    CALL student.login("john123", "pass123")
    CALL admin.login("admin1", "adminpass")

