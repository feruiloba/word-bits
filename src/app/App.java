package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Word newWord;
        double newAttemptValue;
        boolean wrongInput;
        String answer = "y";
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("conundrum", "n. confusing problem or question");
        dictionary.addWord("tangible", "adj. corporeal, touchable");
        dictionary.addWord("munificent",
                "adj. of a gift or sum of money) larger or more generous than is usual or necessary.");
        dictionary.addWord("niggardly", "adj. not generous; stingy.");
        dictionary.addWord("prodigal",
                "adj. spending money or resources freely and recklessly; wastefully extravagant.");
        dictionary.addWord("debauched",
                "adj. made weaker or destroyed by bad sexual behaviour, drinking too much alcohol, taking drugs, etc.:\nhis debauched lifestyle");
        dictionary.addWord("unstinted", "adj. given without restraint; liberal.");
        dictionary.addWord("pittance",
                "n. a very small or inadequate amount of money paid to someone as an allowance or wage.");
        dictionary.addWord("lackluster", "adj. lacking in vitality, force, or conviction; uninspired or uninspiring.");
        dictionary.addWord("impinge", "v. have an effect or impact, especially a negative one.");
        dictionary.addWord("excogitate", "v. think out, plan, or devise.");
        dictionary.addWord("reticence",
                "n. an unwillingness to do something or talk about something, for example because you are nervous or being careful");
        dictionary.addWord("probity", "n. complete honesty");
        dictionary.addWord("unctuous",
                "adj. Unctuous people or behaviour expresses too much praise, interest, friendliness, etc., in a way that is false and unpleasant:\nHis unctuous manner/voice/smile");
        dictionary.addWord("acerbic",
                "adj. used to describe something that is spoken or written in a way that is direct, clever, and cruel:\nThe letters show the acerbic wit for which Parker was both admired and feared.");
        dictionary.addWord("caustic", "adj. strongly critical:\nA caustic remark");
        dictionary.addWord("abstruse", "adj. not known or understood by many people:\nan abstruse philosophical essay");
        dictionary.addWord("perfunctory",
                "adj. done quickly and without showing that you care or have much interest:\nShe asked a few perfunctory questions about my family and then ended the conversation.");
        dictionary.addWord("sanguine",
                "adj. (of someone or someone's character) positive and hopeful:\nSome people expect the economy to continue to improve, but others are less sanguine.");
        dictionary.addWord("ruddy",
                "adj. (of a white person’s skin) having a red color, often suggesting good health:\na ruddy-cheeked girl");
        dictionary.addWord("sanguinary", "adj. involving or causing much bloodshed.");
        dictionary.addWord("coruscant", "adj. glittering; sparkling.");
        dictionary.addWord("emaciated",
                "adj. very thin and weak, usually because of illness or extreme hunger:\nThere were pictures of emaciated children on the cover of the magazine.");
        dictionary.addWord("tepid",
                "adj. (of liquid) not very warm, or (of feelings or actions) not very strong:\nThere is only tepid support in Congress for the proposal.");
        dictionary.addWord("kismet",
                "n. destiny; fate. A force that some people think controls what happens in the future, and is outside human control:\nIt must have been kismet. A few months after accepting the commission, she learned she would be having a baby.");
        dictionary.addWord("excoriate",
                "v. to write or say that a play, book, political action, etc. is very bad:\nHis latest novel received excoriating reviews.\nThe president excoriated the Western press for their biased views.");
        dictionary.addWord("extol", "v. to praise highly:\nHe often extols the virtues of his students.");
        dictionary.addWord("derision",
                "n. actions or statements showing that you think someone or something is ridiculous or of no value:\nTalk of tougher laws was met with derision.");
        dictionary.addWord("felicitous",
                "adj. suitable or right and expressing well the intended thought or feeling:\nHe summed up Jack's achievements in one or two felicitous phrases.");
        dictionary.addWord("stentorian",
                "adj. using a very loud voice, or (of a voice) very loud:\na stentorian preacher\nSuddenly a stentorian voice boomed across the room.");
        dictionary.addWord("spew",
                "v. to flow or let out in large amounts:\nThe volcano spewed (out) a giant cloud of ash, dust, and gases into the air.");
        dictionary.addWord("deleterious",
                "adj. harmful:\nThese drugs have a proven deleterious effect on the nervous system.");
        dictionary.addWord("unencumbered",
                "adj. without something making it difficult for you to do something:\nPeople can decide how to care for their children, unencumbered by interference from the state.");
        dictionary.addWord("translucent",
                "adj. (of a substance) allowing some light to pass through:\nThe vase was made from translucent, milky glass.");
        dictionary.addWord("sheer",
                "adj. not mixed with anything else; pure or complete:\nSome of those books are sheer magic.");
        dictionary.addWord("diaphanous",
                "adj. A diaphanous substance, especially cloth, is so delicate and thin that you can see through it:\na diaphanous silk veil");
        dictionary.addWord("obfuscate",
                "v. to make something less clear and harder to understand, especially intentionally:\nShe was criticized for using arguments that obfuscated the main issue.");
        dictionary.addWord("esoteric",
                "adj. very unusual and understood or liked by only a small number of people, especially those with special knowledge:\nHe has an esoteric collection of old toys and games. \nintended for or understood by only a few people who have special knowledge:\nLiterary readings can sometimes seem esoteric, but we are trying to make them more attractive to more people.\n");
        dictionary.addWord("zealous",
                "adj. enthusiastic and eager:\nHe thought the reporters were too zealous in their attempts to get into the event.");
        dictionary.addWord("pillory",
                "v. to severely criticize someone, especially in a public way:\nAlthough regularly pilloried by the press as an obnoxious loudmouth, he is, nonetheless, an effective politician.");
        dictionary.addWord("diffidence",
                "n. the quality of being shy and not confident of your abilities:\nThe biggest difficulty is overcoming natural British diffidence\nThere was a diffidence in her soft voice.");
        dictionary.addWord("trepidation",
                "n. worry or anxiety about something that is going to happen:\nWith some trepidation, I set out to find my first job.");
        dictionary.addWord("surfeit",
                "n. an amount that is too large, or is more than is needed:\nThe country has a surfeit of cheap labour.");
        dictionary.addWord("paucity",
                "n. the condition of having very little or not enough of something:\nThe authorities had to cope with the paucity of information about the effects of the storm.");
        dictionary.addWord("protracted",
                "adj. lasting for a long time, or made to continue longer than necessary:\nTheir protracted legal battle may soon be resolved.");
        dictionary.addWord("ordeal",
                "n. an experience that is very painful, difficult, or tiring:\nHer seven-month stay in the hospital was quite an ordeal.");
        dictionary.addWord("contrite",
                "adj. feeling regret and guilt for something bad that you have done:\nShe seemed genuinely contrite when she apologized.");
        dictionary.addWord("covet",
                "v. to want to have something very much, especially something that belongs to someone else:\nShe always coveted power but never quite achieved it.\nThe Booker Prize is the most coveted British literary award.");
        dictionary.addWord("gull",
                "n. a large bird that is black or gray and white and that lives near the sea.\n\nsomeone who is easily tricked or cheated:\nWhat a gull I've been!\nSurely he's not such a gull that he would believe her ridiculous story.");
        dictionary.addWord("chary",
                "adj. uncertain and frightened to take risks, or unwilling to take action:\nI'm a bit chary of using a travel agency that doesn't have official registration.");
        dictionary.addWord("diffident",
                "adj. shy and not confident of your abilities:\na diffident manner\nYou shouldn't be so diffident about your achievements - you've done really well!");
        dictionary.addWord("reticent",
                "adj. unwilling to speak about your thoughts or feelings:\nAt first she was reticent, but later she relaxed and was more forthcoming.");
        dictionary.addWord("sardonic",
                "adj. grimly mocking or cynical. Showing an amused attitude toward someone or something that suggests a criticism but does not express it:\na sardonic smile\nMildly sardonic, the chairman’s soft-spoken cross-examination embarrassed hostile witnesses without humiliating them.");
        dictionary.addWord("partisan",
                "adj. involving loyal support of a person, principle, or political party:\npartisan politics");
        dictionary.addWord("municipal", "adj. of or belonging to a town or city:\nmunicipal services");
        dictionary.addWord("belie",
                "v. to represent something falsely or to hide something:\nHis gruff manner belied a gentle personality.");
        dictionary.addWord("bombast",
                "n. language that is intentionally difficult, usually to make something sound more important than it is:\nHere, his balanced tone is a welcome contrast to the bombast of many plan supporters and opponents.");
        dictionary.addWord("mirth", "n. laughter or amusement:\nChen could not contain his mirth.");
        dictionary.addWord("grandiloquence",
                "n. a style or manner of speaking that uses complicated language in order to attract admiration and attention, especially in order to make someone or something seem important:\nHis grandiloquence was a powerful weapon that he used to overcome rivals and enemies.\nHe has not lost the grandiloquence that adds drama to just about everything that comes out of his mouth.");
        dictionary.addWord("debauchery",
                "n. bad sexual behaviour, drinking too much alcohol, taking drugs, etc.:\na life of debauchery");
        dictionary.addWord("opprobrium",
                "n. severe criticism and blame:\nInternational opprobrium has been heaped on the country following its attack on its neighbours.");
        dictionary.addWord("prattle",
                "v. to talk in a silly way or like a child for a long time about things that are not important or without saying anything important:\nShe'd have prattled on about her new job for the whole afternoon if I'd let her.\nStop your prattling and go to sleep!");
        dictionary.addWord("cogent",
                "adj. persuasive and well expressed:\nHe makes a cogent argument for improving early childhood education.");
        dictionary.addWord("eminent",
                "adj. famous and important:\nThe commission consisted of fifteen eminent political figures.");
        dictionary.addWord("enervation",
                "n. a feeling of being drained of energy or vitality; fatigue.\na sense of enervation.");
        dictionary.addWord("pugnacity",
                "n. the quality of wanting to start an argument or fight, or of expressing an argument or opinion very forcefully:\nHis pugnacity and controversial business dealings had made him unpopular.");
        dictionary.addWord("hue",
                "n. a color, or the particular degree of light or dark of a color:\nIn the waters of the Caribbean there are fish of every hue.");
        dictionary.addWord("vitiate",
                "v. to destroy or damage something:\nHe said that American military power should never again be vitiated by political concerns.");
        dictionary.addWord("tantalize",
                "v. to excite or attract someone by offering or suggesting something that is unlikely to be provided or is not enough:\nHer paintings tantalize the eye.");
        dictionary.addWord("bemused",
                "puzzled, confused, or bewildered.\nLucy looked a little bemused");

        System.out.println("Welcome to word study!");
        while (!quit) {

            newWord = dictionary.getBiggestAverageWord();
            System.out.println("\n" + newWord.getWordId() + " - " + newWord.getName());
            System.out.println("\nPress enter to get definition, type 'q' to quit");
            if (sc.hasNextLine()) {
                answer = sc.nextLine();
                if (answer.equals("q")) {
                    quit = true;
                    break;
                } else {
                    System.out.println("\n" + newWord.getDefinition());
                }
            }
            System.out.println("\nType 1 if good, 2 if ok, 3 if bad, type 'q' to quit");
            if (sc.hasNextLine()) {
                wrongInput = true;
                while (wrongInput) {
                    try {
                        answer = sc.nextLine();
                        if (answer.equals("q")) {
                            quit = true;
                            break;
                        } else {
                            newAttemptValue = Double.parseDouble(answer);
                            if (newAttemptValue < 1 || newAttemptValue > 3) {
                                System.out.println("Can only be 1, 2, or 3");
                            } else {
                                newWord.addNewAttemptValue(newAttemptValue);
                                /*
                                 * System.out.println("\nNew average for word " + newWord.getName() + " is: " +
                                 * newWord.getWordAverage());
                                 */
                                wrongInput = false;
                            }
                        }
                    } catch (Exception ex) {
                        System.out.println("Input must be a number. Type 1 if good, 2 if ok, 3 if bad");
                    }
                }
            }
        }
        sc.close();
    }
}