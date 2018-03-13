/**
 * Random Matrix [20 points]
 * You will create a general NxM matrix where N = number of rows 
 * and M = number columns that are specified by the user.
 * Write a generic class of matrix that accepts user-defined
 * N and M as input parameters and generates a random matrix.
 * Each cell of the matrix is a random number.
 * Example 1: Consider a 2x2 matrix: A =  where A[i][j]
 * is a random number between (0,99). 
 * Example 2: Consider a 3x3 matrix A = where A[i][j] is a random
 * number between (0,99). 
 * Thus generate a random matrix A. 
 * Similarly you can generate matrices of other dimensions 
 * by specifying user values N and M. Perform your 
 * operations on these matrices.
 * Note: Your input data should come from a file, 
 * and each file should have two rows as shown below:
 * columns=3
 * rows=3
 * Design and write Java codes that solves the following:
 * Matrix Addition  (2x2, 3x5)
 * Matrix Multiplication (2x2, 3x5)
 * Show your results with at least two examples of each
 * 
 * @author Fabian_Cuero
 */
import java.io.*;
import java.util.Random;

class ReadFromFile{
    private int dimensions[] = { 0, 0};
    public void ReadFromFile(){}
    
    public int[] getDimensionsFromFile(){
        // The name of the file to open.
        String fileName = "D:\\TSU\\OBJ-ORTD\\Programming\\Warm-Up\\Factorials\\files\\temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // read from the file
            int counter = 0;
            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                String s[] = line.split(" ");
                for(int i = 0; i < s.length; i++){
                    //System.out.println(s[i]);
                    if(isInteger(s[i])){
                        dimensions[counter] = Integer.parseInt(s[i]);
                    }
                } // end for i
                counter++;
            } // end while

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        return dimensions;
    } // end
    
    private boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    } // end isInteger
    
}

public class RandomMatrix {
    private static final int maxN = 99;
    private static final int minN = 0;
    public static void main(String[] args){
        
        ReadFromFile getValues = new ReadFromFile();
        int result[] = getValues.getDimensionsFromFile();
        int row = result[1], col = result[0];
        int matrixX[][] = new int[row][col];
        int matrixY[][] = new int[row][col];
        Random random = new Random();
        // load the matrices
        for(int i = 0; i < row; i++){
            System.out.print("|\t"); //
            for(int j = 0; j < col; j++){
                matrixX[i][j] = random.nextInt(maxN - minN) + minN;
                System.out.print(matrixX[i][j]); //
                if (j+1 != col)
                    System.out.print("\t");
                else
                    System.out.print("\t|");    
            } // end for j
            System.out.print("\t|\t"); //
            for(int k = 0; k < col; k++){
                matrixY[i][k] = random.nextInt(maxN - minN) + minN;
                System.out.print(matrixY[i][k]); //
                if (k+1 != col)
                    System.out.print("\t");
                else
                    System.out.print("\t|"); 
            } // end for k
            System.out.println();
        } // end for i
        ///////////////////////////////////
        
        // sum the matrices
        System.out.println("Sum the matrices");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int sumA = matrixX[i][j] + matrixY[i][j];
                System.out.print(sumA+ "\t"); //
            }
            System.out.println();
        }
        
        // multiply the matrices
        System.out.println("Multiply the matrices");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int sumA = 0;
                for(int k = 0; k < row; k++){
                    //System.out.print(matrixX[i][j] + " : " + matrixY[k][j] + " R=");
                    int product = matrixX[i][j] * matrixY[k][j];
                    //System.out.print(product + "\t");
                    sumA += product;
                } // end for k               
                System.out.print(sumA+ "\t"); //
            } // end for j
            System.out.println();
        } // end for i
        
    }
    
}
