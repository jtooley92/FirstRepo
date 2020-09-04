/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylesson.helloworld;

import java.util.Scanner;

/**
 *
 * @author Jtooleyful
 */
public class TextAdventure {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to hamsguard.  You are a knight of the ham as ordained by the king.");
        System.out.println("You travel north on the kingsroad on orders to find and defeat the evil knight Marlock ");
        System.out.println("You come to a crossroad. you must choose to continue north, go east, or go west.");
        System.out.println("Choose a direction");
        String stringOperand1 = myScanner.nextLine();

        if (null == stringOperand1) {
            System.out.println("Your journey takes you eastward and you happen upon a shop.");
            System.out.println("The shopkeep offers you 1 of 3 weapons to aid the king's noble knight in his quest FREE OF CHARGE");
            System.out.println("Will you Choose the poison blowdart, the straight sword, or The master sword? ");
            stringOperand1 = myScanner.nextLine();

            if (null == stringOperand1) {
                System.out.println("Ah! The straight sword is truly a worthy weapon for a knight. you continue eastward on your journey. ");
                System.out.println("You encounter an elderly woman with a hurt ankle crying for help.");
                System.out.println("Do you:");
                System.out.println("heal (this sweet old woman could really use my help)");
                System.out.println("ignore (i have more important things to do with my time)");
                System.out.println("slay (she's obviously one of Marlock's henchmen in disguise)");
                stringOperand1 = myScanner.nextLine();

                if (null == stringOperand1) {
                    System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                    System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                    System.out.println("north (there is a rocky gorge leading to a cave system) ");
                    System.out.println("east (there are white sands and blue seas) ");
                    System.out.println("south (there is a bleak castle on a hill)");
                    System.out.println("which direction do you choose?");
                    stringOperand1 = myScanner.nextLine();

                    if (null == stringOperand1) {
                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                    } else {
                        switch (stringOperand1) {
                            case "south":
                                System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                break;
                            case "east":
                                System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                break;
                            default:
                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                break;
                        }
                    }
                } else {
                    switch (stringOperand1) {
                        case "heal":
                            System.out.println("As you reach into your bag for your medicine the old woman sneak attacks you with a dagger to the heart! GAME OVER");
                            break;
                        case "ignore":
                            System.out.println("as you walk away the old woman hurls a flurry of insults at you");
                            System.out.println("it crushes your spirit, humiliated you cannot continue and you ball up in the fetal position crying.  GAME OVER");
                            break;
                        default:
                            System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                            System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                            System.out.println("north (there is a rocky gorge leading to a cave system) ");
                            System.out.println("east (there are white sands and blue seas) ");
                            System.out.println("south (there is a bleak castle on a hill)");
                            System.out.println("which direction do you choose?");
                            stringOperand1 = myScanner.nextLine();
                            if (null == stringOperand1) {
                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                            } else {
                                switch (stringOperand1) {
                                    case "south":
                                        System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                        break;
                                    case "east":
                                        System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                        break;
                                    default:
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                        break;
                                }
                            }
                            break;

                    }
                }
            } else {
                switch (stringOperand1) {
                    case "poison blowdart":
                        System.out.println("you try to practice your aim with the weapon and accidentally inhale the poison dart... F's in the chat. GAME OVER");
                        break;
                    case "master sword":
                        System.out.println("That only exists in video games nerd! GAME OVER");
                        break;
                    default:
                        System.out.println("Ah! The straight sword is truly a worthy weapon for a knight. you continue eastward on your journey. ");
                        System.out.println("You encounter an elderly woman with a hurt ankle crying for help.");
                        System.out.println("Do you:");
                        System.out.println("heal (this sweet old woman could really use my help)");
                        System.out.println("ignore (i have more important things to do with my time)");
                        System.out.println("slay (she's obviously one of Marlock's henchmen in disguise)");
                        stringOperand1 = myScanner.nextLine();
                        if (null == stringOperand1) {
                            System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                            System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                            System.out.println("north (there is a rocky gorge leading to a cave system) ");
                            System.out.println("east (there are white sands and blue seas) ");
                            System.out.println("south (there is a bleak castle on a hill)");
                            System.out.println("which direction do you choose?");
                            stringOperand1 = myScanner.nextLine();

                            if (null == stringOperand1) {
                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                            } else {
                                switch (stringOperand1) {
                                    case "south":
                                        System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                        break;
                                    case "east":
                                        System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                        break;
                                    default:
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                        break;
                                }
                            }
                        } else {
                            switch (stringOperand1) {
                                case "heal":
                                    System.out.println("As you reach into your bag for your medicine the old woman sneak attacks you with a dagger to the heart! GAME OVER");
                                    break;
                                case "ignore":
                                    System.out.println("as you walk away the old woman hurls a flurry of insults at you");
                                    System.out.println("it crushes your spirit, humiliated you cannot continue and you ball up in the fetal position crying.  GAME OVER");
                                    break;
                                default:
                                    System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                                    System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                                    System.out.println("north (there is a rocky gorge leading to a cave system) ");
                                    System.out.println("east (there are white sands and blue seas) ");
                                    System.out.println("south (there is a bleak castle on a hill)");
                                    System.out.println("which direction do you choose?");
                                    stringOperand1 = myScanner.nextLine();
                                    if (null == stringOperand1) {
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                    } else {
                                        switch (stringOperand1) {
                                            case "south":
                                                System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                                break;
                                            case "east":
                                                System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                                break;
                                            default:
                                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                                break;
                                        }
                                    }
                                    break;

                            }
                        }
                        break;

                }
            }

        } else {
            switch (stringOperand1) {
                case "north":
                    System.out.println("A gang of Marlock's most dangerous henchmen ambush you! GAME OVER");
                    break;
                case "west":
                    System.out.println("You fall victim to a carefully lain spike trap! GAME OVER");
                    break;
                default:
                    System.out.println("Your journey takes you eastward and you happen upon a shop.");
                    System.out.println("The shopkeep offers you 1 of 3 weapons to aid the king's noble knight in his quest FREE OF CHARGE");
                    System.out.println("Will you Choose the poison blowdart, the straight sword, or The master sword? ");
                    stringOperand1 = myScanner.nextLine();
                    if (null == stringOperand1) {
                        System.out.println("Ah! The straight sword is truly a worthy weapon for a knight. you continue eastward on your journey. ");
                        System.out.println("You encounter an elderly woman with a hurt ankle crying for help.");
                        System.out.println("Do you:");
                        System.out.println("heal (this sweet old woman could really use my help)");
                        System.out.println("ignore (i have more important things to do with my time)");
                        System.out.println("slay (she's obviously one of Marlock's henchmen in disguise)");
                        stringOperand1 = myScanner.nextLine();

                        if (null == stringOperand1) {
                            System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                            System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                            System.out.println("north (there is a rocky gorge leading to a cave system) ");
                            System.out.println("east (there are white sands and blue seas) ");
                            System.out.println("south (there is a bleak castle on a hill)");
                            System.out.println("which direction do you choose?");
                            stringOperand1 = myScanner.nextLine();

                            if (null == stringOperand1) {
                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                            } else {
                                switch (stringOperand1) {
                                    case "south":
                                        System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                        break;
                                    case "east":
                                        System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                        break;
                                    default:
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                        break;
                                }
                            }
                        } else {
                            switch (stringOperand1) {
                                case "heal":
                                    System.out.println("As you reach into your bag for your medicine the old woman sneak attacks you with a dagger to the heart! GAME OVER");
                                    break;
                                case "ignore":
                                    System.out.println("as you walk away the old woman hurls a flurry of insults at you");
                                    System.out.println("it crushes your spirit, humiliated you cannot continue and you ball up in the fetal position crying.  GAME OVER");
                                    break;
                                default:
                                    System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                                    System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                                    System.out.println("north (there is a rocky gorge leading to a cave system) ");
                                    System.out.println("east (there are white sands and blue seas) ");
                                    System.out.println("south (there is a bleak castle on a hill)");
                                    System.out.println("which direction do you choose?");
                                    stringOperand1 = myScanner.nextLine();
                                    if (null == stringOperand1) {
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                    } else {
                                        switch (stringOperand1) {
                                            case "south":
                                                System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                                break;
                                            case "east":
                                                System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                                break;
                                            default:
                                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                                break;
                                        }
                                    }
                                    break;

                            }
                        }
                    } else {
                        switch (stringOperand1) {
                            case "poison blowdart":
                                System.out.println("you try to practice your aim with the weapon and accidentally inhale the poison dart... F's in the chat. GAME OVER");
                                break;
                            case "master sword":
                                System.out.println("That only exists in video games nerd! GAME OVER");
                                break;
                            default:
                                System.out.println("Ah! The straight sword is truly a worthy weapon for a knight. you continue eastward on your journey. ");
                                System.out.println("You encounter an elderly woman with a hurt ankle crying for help.");
                                System.out.println("Do you:");
                                System.out.println("heal (this sweet old woman could really use my help)");
                                System.out.println("ignore (i have more important things to do with my time)");
                                System.out.println("slay (she's obviously one of Marlock's henchmen in disguise)");
                                stringOperand1 = myScanner.nextLine();
                                if (null == stringOperand1) {
                                    System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                                    System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                                    System.out.println("north (there is a rocky gorge leading to a cave system) ");
                                    System.out.println("east (there are white sands and blue seas) ");
                                    System.out.println("south (there is a bleak castle on a hill)");
                                    System.out.println("which direction do you choose?");
                                    stringOperand1 = myScanner.nextLine();

                                    if (null == stringOperand1) {
                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                    } else {
                                        switch (stringOperand1) {
                                            case "south":
                                                System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                                break;
                                            case "east":
                                                System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                                break;
                                            default:
                                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                                break;
                                        }
                                    }
                                } else {
                                    switch (stringOperand1) {
                                        case "heal":
                                            System.out.println("As you reach into your bag for your medicine the old woman sneak attacks you with a dagger to the heart! GAME OVER");
                                            break;
                                        case "ignore":
                                            System.out.println("as you walk away the old woman hurls a flurry of insults at you");
                                            System.out.println("it crushes your spirit, humiliated you cannot continue and you ball up in the fetal position crying.  GAME OVER");
                                            break;
                                        default:
                                            System.out.println("as you murder this seemingly helpless old woman Marlock's evil magic fades leaving behind a ruthless cutthroat in the old woman's stead");
                                            System.out.println("You continue your journey to complete your quest.  you come to what feels like the final crossroads");
                                            System.out.println("north (there is a rocky gorge leading to a cave system) ");
                                            System.out.println("east (there are white sands and blue seas) ");
                                            System.out.println("south (there is a bleak castle on a hill)");
                                            System.out.println("which direction do you choose?");
                                            stringOperand1 = myScanner.nextLine();
                                            if (null == stringOperand1) {
                                                System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                                System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                                System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                                System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                            } else {
                                                switch (stringOperand1) {
                                                    case "south":
                                                        System.out.println("i know you're a brave knight and all but you really chose the haunted castle? GAME OVER");
                                                        break;
                                                    case "east":
                                                        System.out.println("The audacity! Trying to vacation on the job? turns out it was an illusion made by Marlock's evil magic.  He lured you into a dungeon to ne imprisoned forever. GAME OVER");
                                                        break;
                                                    default:
                                                        System.out.println("You navigate the cave system expertly and find Marlock awaiting you on a cliff.");
                                                        System.out.println("After an epic and grueling battle you subdue the evil knight ");
                                                        System.out.println("You hurl the evil Knight from the cliff and watch as his body ragdolls down the jagged cliffside.");
                                                        System.out.println("CONGRATULATIONS! You have defeated the evil knight!");
                                                        break;
                                                }
                                            }
                                            break;

                                    }
                                }
                                break;

                        }
                    }
                    break;

            }
        }
    }
}
