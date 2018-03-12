/**
 * Needle in a Haystack [20 points] 
 * You are given a small string called needle and a long string called haystack. 
 * (1) Write a Java program that will find the number of occurrences of 
 * a needle in the haystack. If there is no needle you return 0. 
 * Make your search case insensitive. You cannot use string 
 * library method called contains().
 * (2) Show the computation time (use System.currentTimeMillis()) 
 * for different needles and different haystacks.
 * Example: Haystack = The western American city of San Francisco,
 * California suffered a huge earthquake on April 18th, 1906.
 * More than three thousand people are known to have died.
 * The true number of dead will never be known.
 * Two hundred fifty thousand people lost their homes.
 * Just a few hours after the terrible earthquake, a magazine named
 * Collier's sent a telegraph message to the famous American writer 
 * Jack London. They asked Mr. London to go to San Francisco and 
 * report about what he saw.
 * 
 * Needle = “earthquake” and Ans: 2
 * Needle = “San Francisco” and Ans: 2
 * 
 * @author Fabian_Cuero
 */

import java.util.Scanner;


public class FindText {
    
    public static void main(String[] args){
        // setup local string variables
        String strNeedle = "";
        String strHaystack = "Dissuade ecstatic and properly saw entirely sir why laughter endeavor. In on my jointure saw entirely suitable he followed speedily. Indeed vanity excuse or mr lovers of on. By offer scale an stuff. Blush be sorry no sight. Sang lose of hour then he left find. Next his only boy meet the fat rose when. Do repair at we misery wanted remove remain income. Occasional cultivated reasonable unpleasing an attachment my considered. Having ask and coming object seemed put did admire figure. Principles traveling frequently far delightful its especially acceptance. Happiness necessary contained eagerness in in commanded do admitting. Favourable continuing difficulty had her solicitude far. Nor doubt off widow all death aware offer. We will up able in both do sing. However venture pursuit he am mr cordial. Forming musical am hearing studied be luckily. Ourselves for determine attending how led gentleman sincerity. Valley afford uneasy joy she thrown though bed set. In me forming general prudent on country carried. Behaved an or suppose justice. Seemed whence how son rather easily and change missed. Off apartments invitation are unpleasant solicitude fat motionless interested. Hardly suffer wisdom wishes valley as an. As friendship advantages resolution it alteration stimulated he or increasing. Questions explained agreeable preferred strangers too him her son. Set put shyness offices his females him distant. Improve has message besides shy himself cheered however how son. Quick judge other leave ask first chief her. Indeed or remark always silent seemed narrow be. Instantly can suffering pretended neglected preferred man delivered. Perhaps fertile brandon do imagine to cordial cottage. Did shy say mention enabled through elderly improve. As at so believe account evening behaved hearted is. House is tiled we aware. It ye greatest removing concerns an overcame appetite. Manner result square father boy behind its his. Their above spoke match ye mr right oh as first. Be my depending to believing perfectly concealed household. Point could to built no hours smile sense. Mr do raising article general norland my hastily. Its companions say uncommonly pianoforte favourable. Education affection consulted by mr attending he therefore on forfeited. High way more far feet kind evil play led. Sometimes furnished collected add for resources attention. Norland an by minuter enquire it general on towards forming. Adapted mrs totally company two yet conduct men. Tiled say decay spoil now walls meant house. My mr interest thoughts screened of outweigh removing. Evening society musical besides inhabit ye my. Lose hill well up will he over on. Increasing sufficient everything men him admiration unpleasing sex. Around really his use uneasy longer him man. His our pulled nature elinor talked now for excuse result. Admitted add peculiar get joy doubtful. Call park out she wife face mean. Invitation excellence imprudence understood it continuing to. Ye show done an into. Fifteen winding related may hearted colonel are way studied. County suffer twenty or marked no moment in he. Meet shew or said like he. Valley silent cannot things so remain oh to elinor. Far merits season better tended any age hunted. He unaffected sympathize discovered at no am conviction principles. Girl ham very how yet hill four show. Meet lain on he only size. Branched learning so subjects mistress do appetite jennings be in. Esteems up lasting no village morning do offices. Settled wishing ability musical may another set age. Diminution my apartments he attachment is entreaties announcing estimating. And total least her two whose great has which. Neat pain form eat sent sex good week. Led instrument sentiments she simplicity. Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows.";
        strHaystack = "The western American city of San Francisco, California suffered a huge earthquake on April 18th, 1906. More than three thousand people are known to have died. The true number of dead will never be known. Two hundred fifty thousand people lost their homes. Just a few hours after the terrible earthquake, a magazine named Collier's sent a telegraph message to the famous American writer Jack London. They asked Mr. London to go to San Francisco and report about what he saw.";
        
        // create scanner object to get user input
        Scanner scan = new Scanner(System.in);
        // print the haystack
        System.out.println("Here is the Haystack:\n" + strHaystack);
        int testCount = 1;
        // loop until there's no more text to check
        do{
            
            System.out.println();
            System.out.print("Please type a 'Needle' string to search the Haystack, or type exit: ");
            strNeedle = scan.nextLine();
            // check to see if the user wants to exit the program
            if ("exit".equals(strNeedle.toLowerCase())){
                System.out.println("You've chosen to exit. Goodbye!");
                break;
            }
            
            System.out.println();
            // for the start time 
            long startTime = System.currentTimeMillis();
            int counter = 0; // to count the number of occurrences
            boolean flag = false, foundIt = false;
            // loop thru the haystack for the needle
            for (int i =0; i < strHaystack.length(); i++){
                if (strHaystack.charAt(i) == strNeedle.charAt(0)){
                    for (int j = 0; j < strNeedle.length(); j++){
                        if (strHaystack.charAt(i+j) == strNeedle.charAt(j)){
                            flag = true;
                        } // end if
                        else{
                            flag = false;
                            break;
                        } // end else
                    } // end if
                    if (flag){
                        counter++;
                        foundIt = true;
                    } // end if
                } // end if
            } // end for
            
            System.out.println("Test case: #" + testCount++);
            // check to see if the text is found
            if (!foundIt)
                System.out.println("No match found for needle '"
                        + strNeedle + "' in the haystack.");
            else
                System.out.println("There are " + counter
                        + " matches for neddle '" + strNeedle
                        + "' in the haystack.");
            long endTime = System.currentTimeMillis();

            System.out.println("The process started at: " + startTime);
            System.out.println("The process ended at: " + endTime);
        
        }while (strNeedle.length() != 0);
    }
}
