import java.util.Random;
public class all{
    
        public conversion() {
            String ciphertext = "This is some ciphertext.";
    
            // Convert the ciphertext string to a byte array
            byte[] ciphertextBytes = ciphertext.getBytes();
    
            // Convert each byte to its binary representation and print it
            for (byte b : ciphertextBytes) {
                String binaryString = Integer.toBinaryString(b);
                System.out.print(binaryString + " ");
            }
        }
        
            public RunTest() {
                int binaryStringLength = 100;
                Random random = new Random();
                StringBuilder binaryString = new StringBuilder();
                for (int i = 0; i < binaryStringLength; i++) {
                    int bit = random.nextInt(2);
                    binaryString.append(bit);
                }
        
                // Perform the run test
                int runCount = 1;
                int maxRunCount = 1;
                char lastChar = binaryString.charAt(0);
                for (int i = 1; i < binaryString.length(); i++) {
                    char currentChar = binaryString.charAt(i);
                    if (currentChar == lastChar) {
                        runCount++;
                    } else {
                        maxRunCount = Math.max(maxRunCount, runCount);
                        runCount = 1;
                    }
                    lastChar = currentChar;
                }
                maxRunCount = Math.max(maxRunCount, runCount);
        
                // Print the results
                System.out.println("Binary string: " + binaryString.toString());
                System.out.println("Maximum run length: " + maxRunCount);
            }
    
    
        public ChiSquareTest() {
            int binaryStringLength = 1000;
            Random random = new Random();
            StringBuilder binaryString = new StringBuilder();
            for (int i = 0; i < binaryStringLength; i++) {
                int bit = random.nextInt(2);
                binaryString.append(bit);
            }
    
            // Count the number of 0s and 1s in the binary string
            int numOnes = 0;
            int numZeros = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                char bit = binaryString.charAt(i);
                if (bit == '0') {
                    numZeros++;
                } else {
                    numOnes++;
                }
            }
    
            // Calculate the expected number of 0s and 1s using the null hypothesis
            double expectedZeros = binaryStringLength / 2.0;
            double expectedOnes = binaryStringLength / 2.0;
    
            // Calculate the chi-square statistic
            double chiSquare = Math.pow(numZeros - expectedZeros, 2) / expectedZeros
                    + Math.pow(numOnes - expectedOnes, 2) / expectedOnes;
    
            // Print the results
            System.out.println("Binary string: " + binaryString.toString());
            System.out.println("Number of 0s: " + numZeros);
            System.out.println("Number of 1s: " + numOnes);
            System.out.println("Expected number of 0s: " + expectedZeros);
            System.out.println("Expected number of 1s: " + expectedOnes);
            System.out.println("Chi-square statistic: " + chiSquare);
        }

public static void main(String[] args) {
    conversion();
    RunTest();
    ChiSquareTest();
}}