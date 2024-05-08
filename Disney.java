import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class DisneyPrincessGame extends Application {

    private static final String BACKGROUND_MUSIC = "background_music.mp3";

    @Override
    public void start(Stage primaryStage) {
        // Load background music
        Media backgroundMusic = new Media(new File(BACKGROUND_MUSIC).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(backgroundMusic);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        mediaPlayer.play();

        // Load character and story images
        Image characterImage = new Image(""F:\image"");
        ImageView characterImageView = new ImageView(characterImage);
		ImageView characterImageView = new ImageView(root, 400, 600);

        Image storyImage = new Image(""F:\story image"");
        ImageView storyImageView = new ImageView(storyImage);
 
        // Create a stack pane to stack images
        StackPane root = new StackPane();
        root.getChildren().addAll(storyImageView, characterImageView);

        // Display images in a scene
        Scene scene = new Scene(root, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Disney Princess Adventure");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
	import java.util.Scanner;

public class DisneyPrincessGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Disney Princess Adventure!");

        // Display options for selecting a story
        System.out.println("Please select a Disney princess story:");
        System.out.println("1. Snow White");
        System.out.println("2. Cinderella");
        System.out.println("3. Aurora");
        System.out.println("4. Ariel");
        System.out.println("5. Belle");
        System.out.println("6. Jasmine");
        System.out.println("7. Pocahontas");
        System.out.println("8. Mulan");
        System.out.println("9. Tiana");
        System.out.println("10. Rapunzel");
        System.out.println("11. Merida");
        System.out.println("12. Moana");
        System.out.println("13. Raya");

        int storyChoice = scanner.nextInt();

        switch (storyChoice) {
            case 1:
                playSnowWhiteGame();
                break;
            case 2:
                playCinderellaGame();
                break;
            case 3:
                playAuroraGame();
                break;
            case 4:
                playArielGame();
                break;
            case 5:
                playBelleGame();
                break;
            case 6:
                playJasmineGame();
                break;
            case 7:
                playPocahontasGame();
                break;
            case 8:
                playMulanGame();
                break;
            case 9:
                playTianaGame();
                break;
            case 10:
                playRapunzelGame();
                break;
            case 11:
                playMeridaGame();
                break;
            case 12:
                playMoanaGame();
                break;
            case 13:
                playRayaGame();
                break;
            default:
                System.out.println("Invalid choice. Please select a number between 1 and 13.");
        }
    }

    // Define methods to play each Disney princess game
    private static void playSnowWhiteGame() {
        // import java.util.Scanner;

public class SnowWhiteGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Snow White Adventure!");
        System.out.println("Once upon a time, in a faraway kingdom, there lived a lovely princess named Snow White...");
        System.out.println("As Snow White, you find yourself in the enchanted forest. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You come across a small cottage. Do you:");
        System.out.println("1. Knock on the door.");
        System.out.println("2. Keep walking through the forest.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You knock on the door and are greeted by seven dwarfs. They offer you shelter and protection.");
                System.out.println("You decide to stay with them and help with their chores.");
                break;
            case 2:
                System.out.println("You decide to keep walking through the forest.");
                System.out.println("As you continue your journey, you encounter various creatures but eventually find your way out of the forest.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Snow White's game...");
    }

    private static void playCinderellaGame() {
        // import java.util.Scanner;

public class CinderellaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Cinderella Adventure!");
        System.out.println("Once upon a time, in a faraway kingdom, there lived a lovely princess named Cinderella...");
        System.out.println("As Cinderella, you find yourself in the grand palace. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You are invited to the royal ball. Do you:");
        System.out.println("1. Accept the invitation and attend the ball.");
        System.out.println("2. Decline the invitation and stay at home.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You accept the invitation and attend the royal ball. You have a magical night and captivate everyone with your charm.");
                System.out.println("The prince is enchanted by you and asks you to dance.");
                break;
            case 2:
                System.out.println("You decline the invitation and stay at home.");
                System.out.println("As you sit alone at home, you dream of attending the royal ball and meeting the prince.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Cinderella's game...");
    }

    private static void playAuroraGame() {
        // import java.util.Scanner;

public class AuroraGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Aurora Adventure!");
        System.out.println("Once upon a time, in a kingdom adorned with lush forests and sparkling lakes, there lived a beautiful princess named Aurora...");
        System.out.println("As Aurora, you find yourself exploring the enchanted forest. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a mysterious cottage deep within the forest. Do you:");
        System.out.println("1. Enter the cottage.");
        System.out.println("2. Continue exploring the forest.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You enter the cottage and are greeted by three good fairies.");
                System.out.println("They offer you shelter and protection, revealing that you are the lost princess of the kingdom.");
                break;
            case 2:
                System.out.println("You continue exploring the forest.");
                System.out.println("As you wander deeper into the forest, you encounter magical creatures and hidden wonders.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Aurora's game...");
    }

    private static void playArielGame() {
        // import java.util.Scanner;

public class ArielGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Ariel Adventure!");
        System.out.println("Once upon a time, under the sea, there lived a beautiful princess named Ariel...");
        System.out.println("As Ariel, you find yourself exploring the ocean. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You come across a shipwreck. Do you:");
        System.out.println("1. Investigate the shipwreck.");
        System.out.println("2. Swim away from the shipwreck.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You investigate the shipwreck and find human artifacts.");
                System.out.println("As you explore further, you find a dashing prince trapped inside the wreckage.");
                break;
            case 2:
                System.out.println("You swim away from the shipwreck.");
                System.out.println("As you swim further into the ocean, you encounter various sea creatures and explore hidden treasures.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Ariel's game...");
    }

    private static void playBelleGame() {
        // import java.util.Scanner;

public class BelleGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Belle Adventure!");
        System.out.println("Once upon a time, in a quiet village nestled amidst rolling hills and lush countryside, there lived a curious and adventurous young woman named Belle...");
        System.out.println("As Belle, you find yourself exploring the village. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a mysterious castle on the outskirts of the village. Do you:");
        System.out.println("1. Enter the castle.");
        System.out.println("2. Continue exploring the village.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You enter the castle and are greeted by enchanted household objects.");
                System.out.println("They reveal that the master of the castle is a cursed prince, and only true love can break the spell.");
                break;
            case 2:
                System.out.println("You continue exploring the village.");
                System.out.println("As you wander through the village, you encounter friendly villagers and bustling markets.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}

        System.out.println("Playing Belle's game...");
    }

    private static void playJasmineGame() {
        // import java.util.Scanner;

public class JasmineGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Jasmine Adventure!");
        System.out.println("Once upon a time, in the bustling city of Agrabah, there lived a spirited and independent princess named Jasmine...");
        System.out.println("As Jasmine, you find yourself exploring the bustling marketplace. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a mysterious street vendor selling magical items. Do you:");
        System.out.println("1. Purchase an item from the vendor.");
        System.out.println("2. Continue exploring the marketplace.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You purchase a magical lamp from the vendor.");
                System.out.println("As you examine the lamp, a genie appears and offers you three wishes.");
                break;
            case 2:
                System.out.println("You continue exploring the marketplace.");
                System.out.println("As you wander through the marketplace, you encounter street performers and exotic goods from distant lands.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Jasmine's game...");
    }

    private static void playPocahontasGame() {
        // import java.util.Scanner;

public class PocahontasGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Pocahontas Adventure!");
        System.out.println("Once upon a time, in the heart of the untamed wilderness of the New World, there lived a courageous and free-spirited young woman named Pocahontas...");
        System.out.println("As Pocahontas, you find yourself exploring the lush forests. You must make decisions to navigate through them.");
        
        int choice;
        
        System.out.println("You encounter a river with two paths. Do you:");
        System.out.println("1. Follow the path through the forest.");
        System.out.println("2. Follow the path along the riverbank.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You follow the path through the forest and encounter a group of settlers.");
                System.out.println("As you interact with them, you learn about their struggles and the importance of understanding and harmony.");
                break;
            case 2:
                System.out.println("You follow the path along the riverbank and encounter a playful otter.");
                System.out.println("As you play with the otter, you feel a deep connection to the natural world and the spirits of the land.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Pocahontas's game...");
    }

    private static void playMulanGame() {
        // import java.util.Scanner;

public class MulanGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Mulan Adventure!");
        System.out.println("Once upon a time, in ancient China, there lived a courageous and determined young woman named Mulan...");
        System.out.println("As Mulan, you find yourself training in the army camp. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a challenge during training. Do you:");
        System.out.println("1. Face the challenge head-on.");
        System.out.println("2. Seek help from your comrades.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You face the challenge head-on and overcome it with determination and skill.");
                System.out.println("Your bravery earns you the respect of your comrades and the admiration of your superiors.");
                break;
            case 2:
                System.out.println("You seek help from your comrades and together, you devise a strategy to overcome the challenge.");
                System.out.println("Through teamwork and cooperation, you emerge victorious and strengthen the bonds with your fellow soldiers.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Mulan's game...");
    }

    private static void playTianaGame() {
        // import java.util.Scanner;

public class TianaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Tiana Adventure!");
        System.out.println("Once upon a time, in the bustling city of New Orleans, there lived a determined and ambitious young woman named Tiana...");
        System.out.println("As Tiana, you find yourself working hard to achieve your dream of owning a restaurant. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a setback in your journey. Do you:");
        System.out.println("1. Persevere and keep working towards your dream.");
        System.out.println("2. Give up on your dream and pursue a different path.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You persevere through the setbacks and challenges, never giving up on your dream.");
                System.out.println("Your hard work and determination pay off, and you eventually realize your dream of owning a successful restaurant.");
                break;
            case 2:
                System.out.println("You decide to give up on your dream and pursue a different path.");
                System.out.println("Although you find success in other endeavors, you always wonder what could have been if you had pursued your true passion.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Tiana's game...");
    }

    private static void playRapunzelGame() {
        // import java.util.Scanner;

public class RapunzelGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Rapunzel Adventure!");
        System.out.println("Once upon a time, in a kingdom far away, there lived a courageous and adventurous young woman named Rapunzel...");
        System.out.println("As Rapunzel, you find yourself in the tower. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You discover a hidden passage in the tower. Do you:");
        System.out.println("1. Explore the passage.");
        System.out.println("2. Stay in the tower.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You explore the hidden passage and find a secret staircase leading down from the tower.");
                System.out.println("As you descend the staircase, you discover the world outside the tower for the first time.");
                break;
            case 2:
                System.out.println("You decide to stay in the tower.");
                System.out.println("As you spend more time in the tower, you long for adventure and the freedom to explore the world beyond.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Rapunzel's game...");
    }

    private static void playMeridaGame() {
        // import java.util.Scanner;

public class MeridaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Merida Adventure!");
        System.out.println("Once upon a time, in the mystical highlands of Scotland, there lived a courageous and adventurous young woman named Merida...");
        System.out.println("As Merida, you find yourself exploring the forest. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a fork in the road. Do you:");
        System.out.println("1. Take the path through the forest.");
        System.out.println("2. Take the path over the hills.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You take the path through the forest and encounter various creatures and challenges along the way.");
                System.out.println("As you journey deeper into the forest, you discover hidden wonders and secrets.");
                break;
            case 2:
                System.out.println("You take the path over the hills and enjoy the breathtaking views of the highlands.");
                System.out.println("As you traverse the hills, you encounter friendly wildlife and enjoy the freedom of the open countryside.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Merida's game...");
    }

    private static void playMoanaGame() {
        // import java.util.Scanner;

public class MoanaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Moana Adventure!");
        System.out.println("Once upon a time, in the ancient Polynesian islands, there lived a brave and adventurous young woman named Moana...");
        System.out.println("As Moana, you find yourself on a quest to save your island. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You set sail on your boat. Do you:");
        System.out.println("1. Follow the stars and trust your instincts.");
        System.out.println("2. Ask for guidance from Maui, the demigod.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You follow the stars and trust your instincts.");
                System.out.println("As you journey across the ocean, you encounter challenges and obstacles, but you never lose hope.");
                break;
            case 2:
                System.out.println("You seek guidance from Maui, the demigod.");
                System.out.println("With Maui's help, you navigate through dangerous waters and face powerful foes.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Moana's game...");
    }

    private static void playRayaGame() {
        // import java.util.Scanner;

public class RayaGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Raya Adventure!");
        System.out.println("Once upon a time, in the fantasy world of Kumandra, there lived a brave and resourceful young warrior named Raya...");
        System.out.println("As Raya, you find yourself embarking on a journey to unite the divided lands of Kumandra. You must make decisions to navigate through it.");
        
        int choice;
        
        System.out.println("You encounter a group of warriors from a rival land. Do you:");
        System.out.println("1. Engage in combat with them.");
        System.out.println("2. Attempt to negotiate peace.");
        
        choice = scanner.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("You engage in combat with the warriors and emerge victorious.");
                System.out.println("Your bravery earns you the respect of your allies and strikes fear into the hearts of your enemies.");
                break;
            case 2:
                System.out.println("You attempt to negotiate peace with the warriors.");
                System.out.println("Through diplomacy and understanding, you forge a fragile alliance and take a step towards uniting the lands of Kumandra.");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
        
        System.out.println("The end.");
    }
}
        System.out.println("Playing Raya's game...");
    }
}

}
