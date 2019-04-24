package caesarapplication;

public class CaesarApplication {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        TextAndKey textAndKey = new TextAndKey("hello, world", 13);
        System.out.println(caesar.getCipherText(textAndKey));
    }
}
//      Encryption
//Since the beginning of the writing language, there has been a need to conceal information from the readers, unless they have the knowledge or key to reveal it. In programming this is called encrypting and decrypting.
//Exercise 1 - Solve the problem [group size 3] - Duration: 30 minutes
//Julius Caesar, the once emperor of Rome, used to encrypt confidential messages by shifting each letter therein by some number of places. For instance, he might write A as B, B as C, C as D, and so on, wrapping around alphabetically, Z as A. And so, to say HELLO to someone, Caesar might write IFMMP. Upon receiving such messages from Caesar, recipients would have to decrypt them by shifting letters in the opposite direction by the same number of places. The secrecy of this cryptosystem relied on only Caesar and the recipients knowing a secret, the number of places by which Caesar had shifted his letters (e.g., 1).
//
//Unencrypted text is generally called plaintext. Encrypted text is generally called ciphertext. And the secret used is called a key.
//
//Encrypting HELLO with a key of 1 yields IFMMP
//plaintext: HELLO
//+key = 1
//ciphertext: IFMMP
//      Your task
//          Write down the steps necessary to solve the problem in a piece of paper. Imagine the Caesar algorithm as a black box that receives a plaintext and a key, solves the problem and returns a ciphertext. Break down the problem into smaller problems. What are the difficult tasks to solve? What tools could we use in Java to help us overcoming those talks? What is the sequence of steps necessary to solve the problem?
//  Hints:
//  Write human language. Don’t write code.
//      > Use the why-what-how method to understand the problem.
//      > Use the 1-step method to let the problem solve itself.
//      > Have in mind that we only want to encrypt alphabetical letters [a-z|A-Z]. Spaces and other symbols will be in the ciphertext but they will not be encrypted. So we will only encrypt a letter if it belongs to the alphabet.
//      > The English alphabet has 26 letters.
//   Making sure it works
//          Here you have some examples of keys and inputs you could write and the expected output:
//
//key: 1
//plaintext: HELLO
//ciphertext: IFMMP
//key: 13
//plaintext: hello, world
//ciphertext: uryyb, jbeyq
//key: 13
//plaintext: be sure to drink your Ovaltine
//ciphertext: or fher gb qevax lbhe Binygvar
