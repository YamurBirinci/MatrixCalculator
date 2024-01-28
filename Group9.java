import java.util.Scanner;
import java.util.Arrays;

public class Group9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("         .=#%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*=.        ");
            System.out.println("      %@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#-    ");
            System.out.println("   =@@@+-----------------------------------------------------------------------------------------@@@@@:  ");
            System.out.println("   %@@..-----*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*-----@@@@* ");
            System.out.println("  .@@% .----*@@@@%%######%#%####%#%#%%####*###*#########%########%#########################@@@+------@@@.  ");
            System.out.println("  *@@: ---=@@@@@#...........................................................................@@@%=-----@@=  ");
            System.out.println("  %@@..--=@@@#...              ............MATRIX CALCULATOR............                  ...@@@%=--..@@*  ");
            System.out.println("  %@@..--+@@%.                                                                               .@@@=--::@@* ");
            System.out.println("  %@@..--*@@*                                                                                .%@@=--::@@*");
            System.out.println("  %@@..--*@@*.      1. Matrix Addition                     6. Transpose of the Matrix        .%@@=--:-@@* ");
            System.out.println("  %@@..--*@@*.      2. Matrix Subtraction                7. The Inverse of the Matrix        .#@@=---+@@*  ");
            System.out.println("  %@@..--*@@ .      3. Matrix Multiplication                   8. Trace of the Matrix        .#@@=---#@@* ");
            System.out.println("  %@@..--*@@*.      4. Matrix Division                       9. Adjoint of the Matrix        .#@@=---*@@*  ");
            System.out.println("  %@@..--+@@#.      5. Scalar Multiplication of Matrix        10. Check Orthogonality        .#@@+---*@@* ");
            System.out.println("  %@@..--*@@#.                                                          11. Terminate        .#@@+---*@@*  ");
            System.out.println("  %@@..--=@@@-...              .....Please enter the number (1-11): ....                  ...-@@@=---*@@*  ");
            System.out.println("  %@@..---#@@@+.............................................................................+@@@*----*@@*  ");
            System.out.println("  %@@..----*@@@@@@%%######%#%####%#%#%%####*###*#########%########%######################@@@@@@+-----*@@*  ");
            System.out.println("  %@@..------*%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*-------*@@* ");
            System.out.println("  %@@..----------------------------------------------------------------------------------------------*@@*  ");
            System.out.println("  %@@..------+%@@@@@@@@@@@@@@@@@@@%=------+%@@@@@@@@@@@@@@@@@@@%=------+%@@@@@@@@@@@@@@@@@@@%=-------*@@*  ");
            System.out.println("  %@@..----=@@@@@@@@@@@@@@@@@@@@@@@@#---=@@@@@@@@@@@@@@@@@@@@@@@@#=--=@@@@@@@@@@@@@@@@@@@@@@@@#=-----#@@*  ");
            System.out.println("  %@@..---=@@@@##              ##@@@@@-=@@@@##               #@@@@@==@@@@##              ##@@@@@=----*@@* ");
            System.out.println("  @@@..---%@@@.       +@@@       .@@@@@%%@@@.     +@@@@+      .@@@@@@@@@@*     @@@@@@@    *@@@@@#=---*@@*  ");
            System.out.println("  %@@..---@@@.       -@@@@        .@@@@@@@@.     +@@  @@#       .@@@@@@@.          -@@       :@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.         =@@         .@@@@@@.         .%@@*       .@@@@@@.       +@@@@@@       .@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.         -@@         .@@@@@@.       .@@@@         .@@@@@@.       +@@@@@@       .@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.         -@@         .@@@@@@.      *@@@@          .@@@@@@.           -@@       :@@@=---*@@*  ");
            System.out.println("  %@@..---%@@@.        .@@        .@@@@%@@@.     +@@@@@@@.     .@@@@@@@@+      @@@@@@@      +@@@#=---*@@*  ");
            System.out.println("  %@@..---=@@@@##                #@@@@==@@@@##               ##@@@@==@@@@##                ##@@@=----*@@*  ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@*  ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@*  ");
            System.out.println("  %@@..---=@@@@##              ##@@@@=--=@@@##              ##@@@@=--=@@@##              ##@@@@@=----*@@*  ");
            System.out.println("  %@@..---*@@%.        #@@       .@@@@==@@@      =@@@@@@@+      @@@==@@@.      %@@@@@%      .@@@+----*@@*  ");
            System.out.println("  %@@..---@@@.       =@@@@         -@@@@@@       =@@#            @@@@@@.       @@            :@@%=---*@@*  ");
            System.out.println("  %@@..---@@%.     :@@  @@         .@@@@@@       =@@@@@@:        @@@@@@.       @@%           .@@@=---*@@*  ");
            System.out.println("  %@@..---@@%.    =@@@@@@@@@       .@@@@@@        %@#@%@@+       @@@@@@.       @@@@@@@       .@@@=---*@@* ");
            System.out.println("  %@@..---@@@.     #@@@@@@@@       .@@@@@@.           .@@+       @@@@@@.       @@   @@       .@@@=---*@@* ");
            System.out.println("  %@@..---@@@@+         @@.        @@@@@@@@:     -@@@@@@+      #@@@@@@@@-      %@@@@@%       =@@%=---*@@*  ");
            System.out.println("  %@@..---=@@@@##                #@@@@==@@@@##               ##@@@@==@@@@##                ##@@@=----*@@*  ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@* ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@* ");
            System.out.println("  %@@..---=@@@@##              ##@@@@=--=@@@##              ##@@@@=--=@@@##              ##@@@@@=----*@@*  ");
            System.out.println("  %@@..---+@@@.     =@@###@@:     .@@@==@@@.      %@@@@@%      .@@@==@@@.      %@@@@@%      .@@@+----*@@*  ");
            System.out.println("  %@@..---@@@.      %@@@@@@@%      .@@@@@@.       @@   @@       .@@@@@@.       @@   @@       .@@%----*@@*  ");
            System.out.println("  %@@..--=@@@.          =@@%       .@@@@@@.       @@@@@@@       .@@@@@@.       @@@@@@@       .@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.         +@@*        .@@@@@@.       @@@@@@@       .@@@@@@.            @@       .@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.        +@@+         .@@@@@@.       @@   @@       .@@@@@@.           =@@       .@@@=---*@@*  ");
            System.out.println("  %@@..---@@@@.      =@@=          .@@@@@@@.      %@@@@@%      .@@@@@@@@.      %@@@@@%      .@@@@=---#@@*  ");
            System.out.println("  %@@..---=@@@@##                #@@@@==@@@@##               ##@@@@==@@@@##                ##@@@=----*@@*  ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@=--=@@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@* ");
            System.out.println("  %@@..----+@@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@=----=@@@@@@@@@@@@@@@@@@@@@@@@+-----*@@*   ");
            System.out.println("  %@@..---=@@@@##              ##@@@@=--=@@@##              ##@@@@=--=@@@##              ##@@@@@=----*@@* ");
            System.out.println("  %@@..---%@@@@.     %@@@@@%      .@@@==@@@.       -@@-        .@@@==@@@.    =@@     @@=    .@@@@=---*@@* ");
            System.out.println("  %@@..---@@@.       @@   @@       .@@@@@@.       --@@--        .@@@@@@.      =@@+++@@=      :@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.       @@   @@       .@@@@@@.     =@@@@@@@@@=     .@@@@@@.        @@@@@        :@@@=---*@@*  ");
            System.out.println("  %@@..--=@@@.       @@   @@       .@@@@@@.       --@@--        .@@@@@@.      =@@+++@@=      -@@@=---*@@*  ");
            System.out.println("  %@@:.--=@@@@.      %@@@@@%      .#@@@@@@@.       -@@-        .@@@@@@@@.    =@@     @@=    .@@@%=---*@@*  ");
            System.out.println("  %@@-:---#@@@@##               ##@@@@@##@@@##                ##Q@@@#%@@@##                ##@@@*---=*@@*  ");
            System.out.println("  *@@@*==---*@@@@@@@@@@@@@@@@@@@@@@@=----*@@@@@@@@@@@@@@@@@@@@@@@+----*@@@@@@@@@@@@@@@@@@@@@@@+----=*@@@= ");
            System.out.println("  :@@@%*==----=#@@@@@@@@@@@@@@@@@*=--------=#@@@@@@@@@@@@@@@@@*---------=#@@@@@@@@@@@@@@@@@*=-----=*%@@@.   ");
            System.out.println("    +@@@@@----==------------------------------=---------------=-------------------------------=++#@@@@=   ");
            System.out.println("       :%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#.  ");
            System.out.println("          .=#%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%*=.   ");
        
        
            String number = input.next();
        
    
    // Choosing the operation
            if (number.equals("1")) {
                clearConsole();
                System.out.println("The operation you choose: Matrix Addition");
            
                boolean sizeError = true;
                double[][] matrix1 = null;
                double[][] matrix2 = null;
            
                while(sizeError){
                    matrix1 = creatingFirstMatrix();
                    matrix2 = creatingSecondMatrix();
                
                    boolean sameSizeError = sameSizeErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);
                    boolean limitedSizeError = limitedSizeErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);
                
                    sizeError = sameSizeError || limitedSizeError;
                }
            
                clearConsole();
                matrix1 = fillingMatrix(matrix1);
                matrix2 = fillingMatrix(matrix2);
            
                addition(matrix1, matrix2);

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                
                clearConsole();
            }

            else if (number.equals("2")){
                clearConsole();
                System.out.println("The operation you choose: Matrix Subtraction");
            
                boolean sizeError = true;
                double[][] matrix1 = null;
                double[][] matrix2 = null;
            
                while(sizeError){
                    matrix1 = creatingFirstMatrix();
                    matrix2 = creatingSecondMatrix();
                
                    boolean sameSizeError = sameSizeErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);
                    boolean limitedSizeError = limitedSizeErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);

                    sizeError = sameSizeError || limitedSizeError;
                }
            
                clearConsole();
                matrix1 = fillingMatrix(matrix1);
                matrix2 = fillingMatrix(matrix2);
            
                subtraction(matrix1, matrix2);

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("3")){
        	    clearConsole();
                System.out.println("The operation you choose: Matrix Multiplication");
                boolean sizeError = true;
                double[][] matrix1 = null;
                double[][] matrix2 = null;

                while(sizeError){
                    matrix1 = creatingFirstMatrix();
                    matrix2 = creatingSecondMatrix();
                
                    boolean colRowEqualityError = colRowEqualityErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);
                    boolean limitedSizeError = limitedSizeErroring(matrix1.length, matrix1[0].length, matrix2.length, matrix2[0].length);

                    sizeError = colRowEqualityError || limitedSizeError;
                }

                clearConsole();
                matrix1 = fillingMatrix(matrix1);
                matrix2 = fillingMatrix(matrix2);

                double[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
                printMatrix(resultMatrix);

                System.out.printf("%n%nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();  
            }

            else if (number.equals("4")){
                clearConsole();
                System.out.println("The operation you choose: Matrix Division");

                boolean sizeError = true;
                double[][] matrix = null;
                double scalar = 0;

                while (sizeError) {
                    matrix = creatingFirstMatrix();
                    System.out.print("Enter the scalar value: ");
                    scalar = input.nextDouble();

                    boolean limitedSizeError = OneMatSizeErroring(matrix.length, matrix[0].length);

                    sizeError = limitedSizeError;
                }

                clearConsole();
                matrix = fillingMatrix(matrix);

                double[][] resultMatrix = matScalarDivision(matrix, scalar);
                printMatrix(resultMatrix);
            
                System.out.printf("%n%nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("5")){
                clearConsole();
                System.out.println("The operation you choose: Scalar Multiplication of the Matrix");
            
                boolean sizeError = true;
                double[][] matrix = null;
                double scaler = 0;
            
                while(sizeError){
                    matrix = creatingFirstMatrix();
                    System.out.printf("Enter the scalar value you want to multiply: ");
                    scaler = input.nextDouble();
                
                    sizeError = OneMatSizeErroring(matrix.length, matrix[0].length);
                }
            
                clearConsole();
                matrix = fillingMatrix(matrix);
            
                matScalarMultiplication(matrix, scaler);

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("6")){
                clearConsole();
                System.out.println("The operation you choose: Transpose of the Matrix");
                
                boolean sizeError = true;
                double[][] matrix = null;
            
                while(sizeError){
                    matrix = creatingFirstMatrix();

                    sizeError = OneMatSizeErroring(matrix.length, matrix[0].length);
                }
            
                clearConsole();
                matrix = fillingMatrix(matrix);
                matrix = matTranspose(matrix);
            
                printMatrix(matrix);

                System.out.printf("%n%nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("7")){
                clearConsole();
                System.out.println("The operation you choose: The Inverse of the Matrix");
            
                boolean sizeError = true;
                double[][] matrix = null;

                while (sizeError) 
                {
                    matrix = creatingFirstMatrix();

                    boolean squareMatError = squareMatError(matrix.length, matrix[0].length);
                    boolean limitedSizeError = OneMatSizeErroring(matrix.length, matrix[0].length);
                    sizeError = squareMatError || limitedSizeError;
                }

                clearConsole();
                matrix = fillingMatrix(matrix);

                double[][] inverseMatrix = calculateInverse(matrix);
                if (inverseMatrix != null) {
                    printMatrix(inverseMatrix);
                }
                else {
                    System.out.println("The matrix is not invertible (determinant is zero).");
                }

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("8")){
                clearConsole();
                System.out.println("The operation you choose: Trace of the Matrix");
            
                boolean sizeError = true;
                double[][] matrix = null;
            
                while(sizeError){
                    matrix = creatingFirstMatrix();
                
                    boolean squareMatError = squareMatError(matrix.length, matrix[0].length);
                    boolean limitedSizeError = OneMatSizeErroring(matrix.length, matrix[0].length);
                    sizeError = squareMatError || limitedSizeError;
                }
            
                clearConsole();
                matrix = fillingMatrix(matrix);
            
                traceOfMat(matrix);

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("9")){
                clearConsole();
                System.out.println("The operation you choose: Adjoint of the Matrix");
          
                boolean sizeError = true;
                double[][] matrix = null;

                while (sizeError) {
                    matrix = creatingFirstMatrix();

                    boolean squareMatError = squareMatError(matrix.length, matrix[0].length);
                    boolean limitedSizeError = OneMatSizeErroring(matrix.length, matrix[0].length);

                    sizeError = squareMatError || limitedSizeError;
                }

                clearConsole();
                matrix = fillingMatrix(matrix);

                double[][] adjointMatrix = adjointOfMat(matrix);
                printMatrix(adjointMatrix);

                System.out.println("\nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole();
            }

            else if (number.equals("10")){
                clearConsole();
                System.out.println("The operation you choose: Check the Matrix for Orthogonality");

                boolean sizeError = true;
                double[][] matrix = null;

                while (sizeError) {
                    matrix = creatingFirstMatrix();

                    sizeError = OneMatSizeErroring(matrix.length, matrix[0].length);
                }

                clearConsole();
                matrix = fillingMatrix(matrix);

                boolean isOrthogonal = isOrthogonalMatrix(matrix);

                if (isOrthogonal) {
                    System.out.println("The matrix is orthogonal.");
                }
                else {
                    System.out.println("The matrix is not orthogonal.");
                }

                System.out.printf("%n%nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole(); 

            }

            else if (number.equals("11")){
                clearConsole();
                System.out.println("Console Terminated.");
                break;
            }

            else{
                clearConsole();
                System.out.println("########################################");
                System.out.printf("Your selection is not in the range!%n");
                System.out.printf("           Try Again%n");
                System.out.printf("########################################%n%n");

                System.out.printf("%n%nPress any key to return to the main menu...");
                Scanner scanner = new Scanner(System.in);
                scanner.nextLine();
                clearConsole(); 
            }
        }
    } 
    
    

    // Cleaning the console
    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } 
            
            else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
            
            else {
                for(int clearRow = 0; clearRow < 1000; clearRow++) {
                    System.out.println("\n");
                }
            }
        } 
        
        catch (final Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }



    // Creating the matrixA
    public static double[][] creatingFirstMatrix() {
        Scanner input = new Scanner(System.in);
    
        System.out.printf("%nMATRIX A: ");
        System.out.printf("%nEnter row number: ");
        int row1 = input.nextInt();
        System.out.printf("Enter column number: ");
        int column1 = input.nextInt();
        double[][] matrix1 = new double[row1][column1];
        
        return matrix1;
    }


    // Creating the matrixB
    public static double[][] creatingSecondMatrix() {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%nMATRIX B: ");
        System.out.printf("%nEnter row number: ");
        int row2 = input.nextInt();
        System.out.printf("Enter column number: ");
        int column2 = input.nextInt();
        double[][] matrix2 = new double[row2][column2];
        
        return matrix2;
    }
    

    // Filling the created matrix
    public static double[][] fillingMatrix(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter the value of matrix (%dx%d): ", matrix.length, matrix[0].length);
        System.out.println();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        
        System.out.println();
        return matrix;
    }



    // Checking the size equality between matrices in two-matrix operations
    public static boolean sameSizeErroring(int row1, int column1, int row2, int column2) {
        if ((row1 != row2) || (column1 != column2)){
            System.out.println();
            System.out.println("############ TRY AGAIN ##############");
            System.out.printf("First matrix is (%dx%d) but ", row1, column1);
            System.out.printf("second matrix is (%dx%d)", row2, column2);
            System.out.printf("%nMatrix A and B need to be the same in size. ");
            System.out.printf("%n#####################################%n%n");
            return true;
        }
        
        if ((row1 == 0) || (row2 == 0) || (column1 == 0) || (column2 == 0)){
            System.out.println();
            System.out.println("############ TRY AGAIN ##############");
            System.out.printf("First matrix is (%dx%d) and ", row1, column1);
            System.out.printf("second matrix is (%dx%d)", row2, column2);
            System.out.printf("%nAny dimension cannot be equal to 0.");
            System.out.printf("%n#####################################%n%n");
            return true;
        }
        return false;
    }


    // Checking square (nxn) matrix size in single matrix operations
    public static boolean squareMatError(int row, int column)
    {
        if(row!=column)
        {
            System.out.println();
            System.out.println("############ TRY AGAIN ##############");
            System.out.printf("Provided matrix should be a square matrix (nxn sized)");
            System.out.printf("%n#####################################%n%n");
            return true;
        }
        if(row==0 || column==0)
        {
            System.out.println();
            System.out.println("############ TRY AGAIN ##############");
            System.out.printf("Any dimension cannot be equal to 0.");
            System.out.printf("%n#####################################%n%n");
            return true;
        }
        return false;
    }


    // Checking column1-row2 equality in multiplication
    public static boolean colRowEqualityErroring(int row1, int column1, int row2, int column2) {
        if ((row2 != column1)){
            System.out.println();
            System.out.println("############ TRY AGAIN ##############");
            System.out.printf("First matrix is (%dx%d) and ", row1, column1);
            System.out.printf("second matrix is (%dx%d)", row2, column2);
            System.out.printf("%nThe number of columns in matrixA should be equal to the number of rows in matrixB. ");
            System.out.printf("%n#####################################%n%n");
            return true;
        }
        return false;
    }


    // Checking row-column dimension limitation in two-matrix operations
    public static boolean limitedSizeErroring(int row1, int column1, int row2, int column2) {
        int[] dimensions = {row1, column1, row2, column2};
        int minLimit = 2;
        int maxLimit = 5;
        
        for (int value : dimensions) {
            if (value < minLimit || value > maxLimit) {
                System.out.println();
                System.out.println("############ TRY AGAIN ##############");
                System.out.printf("First matrix is (%dx%d) and ", row1, column1);
                System.out.printf("second matrix is (%dx%d)", row2, column2);
                System.out.printf("%nThe size of the matrix should be between 2-5.");
                System.out.printf("%n#####################################%n%n");
                return true;
            }
        }
        return false;
    }
    

    // Checking row-column dimension limitation in one-matrix operations
    public static boolean OneMatSizeErroring(int row, int column)
    {
        int[] dimensions = {row, column};
        int minLimit = 2;
        int maxLimit = 5;
        for (int value : dimensions) {
            if (value < minLimit || value > maxLimit) 
            {
                System.out.println();
                System.out.println("############ TRY AGAIN ##############");
                System.out.printf("Matrix A is (%dx%d) but ", row, column);
                System.out.printf("the size of the matrix should be between 2-5.");
                System.out.printf("%n#####################################%n%n");
                return true;
            }
        }
        return false;                
            
    }



    // Printing the result matrix
    public static void printMatrix(double[][] matrix) 
    {
        System.out.printf("%n%nResult matrix (%dx%d): %n", matrix.length, matrix[0].length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) 
            {
                if (matrix[i][j] == (int)(matrix[i][j])){
                    System.out.printf("%d ", (int)(matrix[i][j]));
                }
                else{
                    System.out.printf("%.2f ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }    



    // Performing addition operation in matrix
    public static void addition(double[][] matrix1, double[][] matrix2) 
    {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[0].length; j++)
            {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        printMatrix(resultMatrix);
    }
    

    // Performing subtraction operation in matrix
    public static void subtraction(double[][] matrix1, double[][] matrix2) 
    {
        double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];

        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1[0].length; j++)
            {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        printMatrix(resultMatrix);   
    }
    

    // Performing multiplication in the matrix
   public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        double[][] result = new double[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                double sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    //Performing scalar division in the matrix
    public static double[][] matScalarDivision(double[][] matrix, double scalar) {
        int row = matrix.length;
        int col = matrix[0].length;
        double[][] resultMatrix = new double[row][col];
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resultMatrix[i][j] = matrix[i][j] / scalar;
            }
        }
        return resultMatrix;
    }


    //Performing scalar multiplication in the matrix
    public static void matScalarMultiplication(double[][] matrix, double input)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] ScalarMultiplication = new double[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                ScalarMultiplication[i][j] = matrix[i][j] * input;
            }
        }

        printMatrix(ScalarMultiplication);
    }


    //Performing matrix transpose
    public static double[][] matTranspose(double[][] matrix)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
            	transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }


    // Performing inverse matrix using the Gaus-Jordan Method
    public static double[][] calculateInverse(double[][] matrix)
    {
        int n = matrix.length;
        double[][] augmentedMatrix = new double[n][2 * n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                augmentedMatrix[i][j] = matrix[i][j]; // Contains user-defined matrix from 0 to j (on the left)
                augmentedMatrix[i][j + n] = (i == j) ? 1.0 : 0.0; // From j to the end (on the right) is the identity matrix.
            }
        }


        for (int i = 0; i < n; i++) 
        {
            double pivot = augmentedMatrix[i][i];
            if (pivot == 0.0) 
            {
                // If the pivot is 0, the matrix cannot be inverted. (The pivot value represents the diagonal elements of the matrix)
                return null;
            }
    
            // Obtaining the identity matrix
            for (int j = 0; j < 2 * n; j++) 
            {
                augmentedMatrix[i][j] /= pivot;
            }
    
            for (int k = 0; k < n; k++) 
            {
                if (k != i) 
                {
                    double factor = augmentedMatrix[k][i];
                    for (int j = 0; j < 2 * n; j++) 
                    {
                        augmentedMatrix[k][j] -= factor * augmentedMatrix[i][j];
                    }
                }
            }
        }


        // The final version of the identity matrix on the right gives the inverse matrix.
        double[][] inverseMatrix = new double[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                inverseMatrix[i][j] = augmentedMatrix[i][j + n];
            }
        }
        return inverseMatrix;
    }


    // Performing trace matrix
    public static void traceOfMat(double[][] matrix)
    {
        int rows = matrix.length;
        double sum = 0;

        for (int i = 0; i < rows; i++) 
        {
        	sum += matrix[i][i];
        }

        System.out.printf("Trace of matrix is = %.2f", sum);
    }


    // Performing adjoint matrix
    public static double[][] adjointOfMat(double[][] matrix)
    {
        int matrixSize = matrix.length;
        double[][] adjointMatrix = new double[matrixSize][matrixSize];
        
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                double[][] minor = matrixMinor(matrix, i, j);
                double determinant = calDeterminant(minor);
                int sign = ((i + j) % 2 == 0) ? 1 : -1;
                adjointMatrix[i][j] = sign * determinant;
            }
        }
        return matTranspose(adjointMatrix);
    }
    
    // Calculating minor of matrix
    public static double[][] matrixMinor(double[][] matrix, int row, int column) {
        int matrixSize = matrix.length;
        double[][] minor = new double[matrixSize - 1][matrixSize - 1];
        int rowIndex = 0;
        for (int i = 0; i < matrixSize; i++) {
            if (i == row) continue;
            int columnIndex = 0;
            for (int j = 0; j < matrixSize; j++) {
                if (j == column) continue;
                minor[rowIndex][columnIndex] = matrix[i][j];
                columnIndex++;
            }
            rowIndex++;
        }
        return minor;
    }

    // Calculating determinant of matrix
    public static double calDeterminant(double[][] matrix) {
        int matrixSize = matrix.length;
        if (matrixSize == 1) {
            return matrix[0][0];
        }
        if (matrixSize == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
    
        double determinant = 0;
        for (int i = 0; i < matrixSize; i++) {
            double sign = (i % 2 == 0) ? 1 : -1;
            double[][] minor = matrixMinor(matrix, 0, i);
            determinant += sign * matrix[0][i] * calDeterminant(minor);
        }
        return determinant;
    }


    // Performing orthogonal matrix
    public static boolean isOrthogonalMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows != cols) {
        	System.out.println("Non-square matrices cannot be orthogonal matrices.");            
        	return false;
        }

        double[][]  transpose = new double [rows][cols];
        transpose = matTranspose(matrix);

        double[][] result = multiplyMatrices(matrix, transpose);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){

                if(i == j){
                    if(result[i][j] != 1){
                        return false;
                    }
                }
                else{
                    if(result[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}