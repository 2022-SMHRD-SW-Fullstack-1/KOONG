package model;

public class Ascii {

	public void ascii(int num) {
		if(num == 1) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀[S] 양파쿵야⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢠⣶⣶⣄⠀⠀⠀⠀⣠⣶⣶⡀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣾⣿⣿⣿⡆⠀⠀⣰⣿⣿⣿⡆⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣿⣿⣿⣿⣿⣤⣤⣿⣿⣿⣿⡆⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣿⡿⠟⠉⠀⠀⠀⠀⠉⠿⣿⣿⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⡿⢁⣀⣀⠀⠀⠀⠀⣀⣀⡈⣿⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣧⠋⣴⣻⣇⠀⠀⣼⣛⣦⢹⢹⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⡏⠀⠹⠿⢋⣀⣀⠘⠿⠏⠀⣸⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣇⣰⡀⠀⠸⠀⠀⠃⠀⢠⢆⡽⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠈⠻⢷⣄⣀⣀⣀⣀⣠⠿⠟⠁⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠘⣿⡏⢿⣿⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
			System.out.println(
					  "       [S] 양파쿵야    \r\n"  
					+ "      __      __  \r\n"
					+ "     |  |     |  |\r\n"
					+ "     |  |     |  |\r\n"
					+ "     |  |_____|  |\r\n"
					+ "     |           |\r\n"
				    + "     |           |\r\n"
					+ "     |  __   __  |\r\n"
					+ "     |  Ｏ _ Ｏ  |\r\n"
					+ "     |           |\r\n"
					+ "     |_|       |_|\r\n"
					+ "     |___________|");
			
			
		
		}else if(num == 2) {
//			System.out.println( 
//					  "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ [S] 샐러리쿵야⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡤⠤⠤⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠉⠀⠀⠀⠀⠀⠀⠉⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀  ⠀\r\n"
//					+ "⠀⠀⠀⡠⠒⠉⠉⠉⠉⢲⡏⢠⠦⠀⠀⠀⠀⠀⠀⠶⡦⠸⡖⠉⠉⠉⠉⠓⢦⠀⠀ \r\n"
//					+ "⠀⠀⢸⠁⢀⡶⠾⢶⣄⣿⠀⢀⣤⣄⠀⠀⠀⠀⣠⣤⡀⠀⢻⣤⡶⠷⢶⡀⠈⣧⠀⠀\r\n"
//					+ "⠀⠀⢸⠀⢸⣇⢶⣼⣿⡇⡆⠎⣼⣽⡗⠀⠀⢸⣯⣷⠙⢰⣼⣟⢷⡶⢺⡇⠀⡿⠀⠀\r\n"
//					+ "⠀⠀⠈⢧⡀⠛⠷⠾⢋⣼⡇⠀⠸⠿⠃⠀⠀⠈⠿⠟⠀⢸⣷⣙⠷⠾⠛⢀⡰⠃⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠉⠓⠲⠞⠛⠋⢣⡀⢦⠀⠀⢯⠉⢹⠀⣠⠄⡼⠉⠛⠻⠖⠚⠋⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠺⣧⣄⣀⣀⣀⣼⠷⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢤⣾⣿⣿⣷⣿⣿⣾⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠛⠛⠛⠛⠛⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [S] 샐러리쿵야      \r\n"  
					+ "          ＯＯＯＯＯ      \r\n"
				    + "         Ｏ        Ｏ    \r\n"
					+ "   ＯＯ Ｏ          Ｏ ＯＯ   \r\n"
					+ "  Ｏ  ＯＯ Ｏ _ Ｏ  ＯＯ  Ｏ \r\n"
					+ "   ＯＯ Ｏ          Ｏ ＯＯ  \r\n"
					+ "         Ｏ        Ｏ      \r\n"
					+ "          ＯＯＯＯＯ       ");
			
			
		}else if(num == 3) {
//			System.out.println(
//					  "⠀⠀⠀⠀ [S] 주먹밥쿵야⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⣠⣾⣿⣿⣿⡏⠀⠈⠉⠉⠒⠊⠒⡄⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⣿⣿⣿⣿⠿⠇⠀⠀⠀⠀⠀⠀⠀⠓⡀⠀⠀\r\n"
//					+ "⠀⠀⡐⢀⣩⣤⣤⣶⡀⠀⠀⢰⣶⣤⣤⣀⠐⡄⠀⠀\r\n"
//					+ "⠀⠀⠇⠀⠿⢟⣛⠋⠁⠀⠀⠈⢛⣛⠿⠏⠀⡇⠀⠀\r\n"
//					+ "⠀⠀⠇⠀⢰⣿⣭⣷⠀⠀⠀⢰⣯⣽⣿⠀⠀⡇⠀⠀\r\n"
//					+ "⠀⠀⢸⠀⠀⠙⠛⠃⠀⠀⠀⠀⠙⠛⠋⠀⢰⠁⠀⠀\r\n"
//					+ "⠀⠀⠀⢆⠘⣞⠓⠀⠚⠉⠉⠃⠀⠛⡷⢀⠜⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠙⠺⠤⣀⣀⣀⣀⣀⣀⠬⠛⠉⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠷⠼⠏⠻⠴⠇⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "      [S] 주먹밥쿵야    \r\n"  
					+ "    ________________\r\n"
				    + "   |###             |\r\n"
					+ "   |### __  __      |\r\n"
					+ "   |##  Ｏ _ Ｏ     |\r\n"
					+ "   |                |\r\n"
					+ "   |_|            |_|\r\n"
					+ "   |________________|");
					
		}else if(num == 4) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[A] 마늘쿵야⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⠏⠀⣿⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⢀⡴⢒⡷⠒⠒⠚⢿⡒⢦⡀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣠⠏⠀⣸⣤⣤⣤⣤⣤⣇⠀⠹⣄⠀⠀⠀\r\n"
//					+ "⠀⠀⢀⡜⠁⠀⡾⠁⠀⠈⠀⠁⠀⡈⣷⠀⠈⢧⡀⠀\r\n"
//					+ "⠀⠀⣿⠀⠀⢸⡟⣽⣻⡆⠀⢰⣟⡏⢿⡇⠀⠀⣷⠀\r\n"
//					+ "⠀⠀⢿⣄⠀⢸⡇⠘⠟⢁⣀⡈⠿⠃⢸⡇⠀⣠⡿⠀\r\n"
//					+ "⠀⠀⠈⠛⠿⢾⣷⣷⡄⠘⠀⠃⢠⣮⣾⡷⠿⠛⠁⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣷⣤⡀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠈⠙⠛⠻⠿⠿⠿⠟⠛⠋⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [A] 마늘쿵야    \r\n"  
					+ "            _     \r\n"
					+ "           | |    \r\n"
					+ "       ___|   |__  \r\n"
				    + "      |          |  \r\n"
					+ "      | __    __ |  \r\n"
					+ "     |  Ｏ _ Ｏ   |  \r\n"
					+ "    |              | \r\n"
					+ "     |_|        |_|  \r\n"
					+ "      |__________|  ");
		}else if(num == 5) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[A] 무우쿵야⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢠⣴⣄⠀⣿⣿⣿⣿⠀⣠⣦⡀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⡇⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⢀⣾⡿⠟⠛⠛⠛⠛⠛⠛⠿⢿⣦⡀⠀⠀⠀\r\n"
//					+ "⠀⠀⢠⡿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⡄⠀⠀\r\n"
//					+ "⠀⠀⣿⠀⣠⡤⢤⡀⠀⠀⠀⠀⣀⡤⢤⡀⠈⣧⠀⠀\r\n"
//					+ "⠀⠀⡏⢰⠃⣶⣛⣾⠀⠀⠀⢰⣷⣛⣦⠙⡄⣿⠀⠀\r\n"
//					+ "⠀⠀⡇⠀⠀⢿⣿⡿⠀⠀⠀⠀⢿⣿⡏⠀⠀⣿⠀⠀\r\n"
//					+ "⠀⠀⣟⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠉⠀⡀⠀⣿⠀⠀\r\n"
//					+ "⠀⠀⠙⣤⣜⣦⠠⠤⠤⠤⠤⠤⠤⢄⡼⣣⡴⠃⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠉⠛⠶⣤⣤⣤⣤⣤⣴⠾⠛⠉⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠻⠿⠀⠘⠿⠏⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [A] 무우쿵야    \r\n"
					+ "         ||||     \r\n"
					+ "       __||||__\r\n"
					+ "      |        |\r\n"
					+ "     |          |\r\n"
				    + "     |  _    _  |\r\n"
					+ "   __|          |__\r\n"
					+ "  |__  Ｏ _ Ｏ   __|   \r\n"
					+ "     |          |  \r\n"
					+ "      |        |  \r\n"
					+ "       |      |  \r\n"
					+ "         |  |   \r\n"
					+ "          ||    ");
		}else if(num == 6) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀ [A] 반계쿵야⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⢀⠄⠒⠉⠉⠉⠉⠉⠑⠂⢄⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⡄⠀⠀\r\n"
//					+ "⠀⠀⠀⠸⠀⠀⠀⣠⠤⠶⠒⠲⠦⢤⡀⠀⠀⠸⡀⠀\r\n"
//					+ "⠀⠀⠀⡇⠀⢠⠞⠁⠀⠀⠀⠀⠀⠀⠙⢦⠀⠀⡇⠀\r\n"
//					+ "⠀⠀⢸⠀⠀⣿⡶⣶⣦⡀⠀⠀⣠⣶⡶⢾⡇⠀⢸⠀\r\n"
//					+ "⠀⠀⢸⠀⠀⡏⢸⣷⣿⠅⠀⠀⢿⣷⣿⠈⡇⠀⢸⠀\r\n"
//					+ "⠀⠀⢸⠀⠀⡇⠈⠻⠛⠀⠀⠀⠈⠻⠋⠀⡇⠀⢸⠀\r\n"
//					+ "⠀⠀⠈⢆⠀⣿⣄⡀⠀⠘⠛⠛⠀⠀⣀⣼⡇⢀⠎⠀\r\n"
//					+ "⠀⠀⠀⠈⠲⣬⠏⠛⠳⠶⠶⠶⠶⠛⠋⢯⡴⠊⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠉⠒⡖⢲⠶⢶⠒⡖⠊⠁⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠙⠚⠀⠘⠚⠁⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "      [A] 반계쿵야    \r\n"  
					+ "          ＯＯ       \r\n"
					+ "        Ｏ    Ｏ     \r\n"
					+ "      Ｏ        Ｏ     \r\n"
				    + "     Ｏ          Ｏ     \r\n"
					+ "    Ｏ   __  __   Ｏ    \r\n"
					+ "    Ｏ  Ｏ _ Ｏ   Ｏ  \r\n"
					+ "    Ｏ            Ｏ   \r\n"
					+ "     Ｏ|_|    |_|Ｏ    \r\n"
					+ "      Ｏ        Ｏ    \r\n"
					+ "        ＯＯＯＯ        \r\n\"");
		}else if(num == 7) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[A] 사과쿵야⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⢴⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢀⣤⣶⣶⣾⣿⣿⣶⣶⣶⣦⣄⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⡼⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢳⡄⠀⠀\r\n"
//					+ "⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀\r\n"
//					+ "⠀⠀⣿⣿⣿⣿⣿⣿⠟⠋⠉⠛⣿⣿⣿⣿⣿⣿⠀⠀\r\n"
//					+ "⠀⠀⢹⣿⣿⣿⠋⣯⣷⠀⠀⢸⣽⡏⢿⣿⣿⡿⠀⠀\r\n"
//					+ "⠀⠀⠀⢻⣿⡇⠀⠛⠋⠠⠤⠈⠛⠁⢸⣿⣿⠃⠀⠀\r\n"
//					+ "⠀⠀⠀⠈⠻⠛⢦⣻⠁⠀⠀⠀⣽⡡⠞⠿⠃⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⣠⣤⣶⣿⣿⣿⣿⣷⣤⣄⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠈⠙⠛⠛⠿⠿⠛⠛⠋⠉⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [A] 사과쿵야    \r\n" 
					+ "          ||        \r\n"
					+ "       ___||_____     \r\n"
					+ "     |            |   \r\n"
				    + "    |              |   \r\n"
					+ "   |     __  __  |   \r\n"
					+ "   |    Ｏ _ Ｏ|    \r\n"
					+ "   |             |   \r\n"
					+ "    ||_|          |  \r\n"
					+ "     | _________ |   \r\n");
		}else if(num == 8) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀[A] 양배추쿵야⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⢀⣠⣤⣦⣤⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⢠⣿⢟⣯⡍⠛⣿⡆⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⣠⣶⣶⣼⡇⣾⣿⣿⣧⣼⣷⣶⣶⣄⠀⠀⠀\r\n"
//					+ "⠀⠀⢸⣷⣶⣿⣿⣿⣾⣟⣻⣿⣿⣿⣿⣶⣾⡇⠀⠀\r\n"
//					+ "⠀⠀⠸⣷⣿⣿⡿⠉⠛⠿⠿⠛⠉⢿⣿⣿⣾⠏⠀⠀\r\n"
//					+ "⠀⠀⣞⣻⣿⢩⢖⠶⡄⠀⠀⢠⠶⡲⡍⣿⣟⣳⠀⠀\r\n"
//					+ "⠀⠀⠹⣿⣿⠀⠸⣿⡟⠀⠀⠻⣿⠇⠀⣿⣿⠏⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠸⡀⢄⠀⠀⠋⠉⠀⠀⡠⢀⠇⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠙⠾⣇⣀⣀⣀⣀⣸⠷⠋⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠫⠏⠹⠼⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "      [A] 양배추쿵야    \r\n"  
					+ "      ＯＯＯＯＯ    \r\n"
					+ "    ＯＯ         ＯＯ  \r\n"
				    + "   Ｏ              Ｏ \r\n"
					+ "   Ｏ    __  __    Ｏ \r\n"
					+ "   Ｏ    Ｏ _ Ｏ    Ｏ \r\n"
					+ "   Ｏ              Ｏ \r\n"
					+ "    ＯＯ|_|  |_|ＯＯ  \r\n"
					+ "      ＯＯＯＯＯＯ    ");
		}else if(num == 9) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[A] 피망쿵야⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⣀⣤⣤⣀⠀⠀⣠⣤⣤⡀⢀⣠⣤⣄⠀⠀⠀\r\n"
//					+ "⠀⢀⣾⣿⣿⣿⣿⣧⡰⢿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀\r\n"
//					+ "⠀⣼⣿⣿⣿⠁⠈⢻⠁⢸⣿⣿⣿⡏⠀⢻⣿⣿⣿⠀\r\n"
//					+ "⠀⢿⣿⣿⡏⠀⠀⠀⠀⠘⣿⣿⣿⠃⠀⠸⣿⣿⣿⠁\r\n"
//					+ "⠀⠀⠉⠉⢸⢀⠔⣲⣄⠀⠙⢻⣗⡢⡀⡇⠈⠉⠁⠀\r\n"
//					+ "⠀⠀⠀⠀⢸⠀⠘⣶⡿⠀⠀⢸⣶⡇⠀⡇⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢸⠀⠀⠉⠀⠀⠀⠀⠉⢀⠀⡁⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠳⢌⣆⠒⠒⠒⠒⣢⡢⠔⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠫⠏⠹⠽⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [A] 피망쿵야    \r\n"  
					+ "    ________________\r\n"
				    + "   |   |        |   |\r\n"
					+ "   |   |        |   |\r\n"
					+ "     |   __  __   |\r\n"
					+ "     |  Ｏ _ Ｏ   |\r\n"
					+ "     |            |\r\n"
					+ "   |   |        |   |\r\n"
					+ "   |___|________|___|\r\n");
		}else if(num == 10) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[A] 호박쿵야⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⣀⣠⣤⣤⠜⠀⠡⣤⣤⣄⣀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⢠⣮⠖⠋⢱⡟⣋⣉⣙⢻⡎⠙⠲⣵⣄⠀⠀\r\n"
//					+ "⠀⠀⢀⣿⣿⣿⡿⠋⠿⠿⠻⠟⠿⠋⢿⣿⣿⣿⡀⠀\r\n"
//					+ "⠀⠀⠘⣿⣿⣿⢡⢒⠶⡄⠀⢀⡶⡖⠌⣿⣿⣿⠇⠀\r\n"
//					+ "⠀⠀⠀⠹⣿⣿⠀⠸⠿⠁⠀⠈⠿⠇⠀⣿⣿⠟⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠈⠻⣄⠠⡀⠘⠉⠅⢀⠄⣠⠿⠃⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠉⠑⣖⠖⣒⠊⠉⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [A] 호박쿵야    \r\n" 
					 + "       _________    \r\n"
					+ "           ||     \r\n"
					+ "    _______||_______\r\n"
				    + "   |  |    |     |  |\r\n"
					+ "   |  |  __  __  |  |\r\n"
					+ "   |  | Ｏ _ Ｏ  |  |\r\n"
					+ "   |  |          |  |\r\n"
					+ "   |  |    |     |  |\r\n"
					+ "   |________________|");
		}else if(num == 11) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀[F] 버섯쿵야⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⢀⣴⣿⣯⣀⠀⠀⣠⣿⣷⣤⡀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⢠⠛⠏⠁⠀⠉⣿⣿⠁⠀⠈⠻⠳⡀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⡇⢀⢧⣀⣠⠊⠀⠀⢠⣀⣀⣤⠀⢣⠀⠀⠀\r\n"
//					+ "⠀⠀⢰⡇⢀⣿⣿⣿⣷⣦⣴⣾⣿⣿⣷⠀⢺⡀⠀⠀\r\n"
//					+ "⠀⠀⣿⣷⡟⡹⣫⠷⡄⠀⠀⣰⠮⡟⡝⣿⣾⣧⠀⠀\r\n"
//					+ "⠀⠀⣿⣿⡇⠀⢻⣿⠇⠀⠀⢻⣿⡇⠀⣿⣿⡟⠀⠀\r\n"
//					+ "⠀⠀⠘⢿⣇⠀⡀⠀⢠ ⠒⢠⠀⠀⢠⠀⣿⠟⠁⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠈⠢⢵⣀⠀⠒⠒ ⣰⡥⠞⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠉⢯⡏⢯⡝⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
			System.out.println(
					  "       [F] 버섯쿵야    \r\n"  
					+ "    ________________\r\n"
				    + "   |                |\r\n"
					+ "   |    __  __      |\r\n"
					+ "       |Ｏ _ Ｏ |\r\n"
					+ "       |        |\r\n"
					+ "       ||_|  |_||\r\n"
					+ "       |________|");
		}else if(num == 12) {
//			System.out.println(
//					  "⠀⠀⠀⠀⠀⠀ [F] 똥군⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⢀⡴⠖⠶⠛⠈⢻⣆⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⣠⣶⠾⣷⣶⠶⠶⢶⣶⢿⣶⣄⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⢠⣿⢅⣀⣸⣿⠀⠀⢿⡇⣀⡈⣿⡆⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⣘⣿⢋⣝⢻⣷⣶⣶⣶⡟⣻⡝⢿⣇⠀⠀⠀\r\n"
//					+ "⠀⠀⣾⠉⠁⠘⣿⣿⠛⠀⠀⠘⢿⣿⠇⠈⠉⢷⡀⠀\r\n"
//					+ "⠀⠀⣿⡀⢠⡀⠀⠀⢸⠦⠴⡇⠀⠀⢀⡄⢀⣼⠃⠀\r\n"
//					+ "⠀⠀⠈⠻⢶⣽⣦⣤⣤⣤⣤⣤⣤⣴⣯⡶⠟⠁⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠘⠿⠏⠉⠿⠇⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println(
					  "       [F] 똥군    \r\n"  
					+ "          ____\r\n"
					+ "         |    |\r\n"
				    + "       |       |\r\n"
					+ "      |__  __   |\r\n"
					+ "     | Ｏ _ Ｏ    |\r\n"
					+ "    |              |\r\n"
					+ "   |  |_|      |_|  |\r\n"
					+ "   |________________|");
		}else if(num == 13) {
//			System.out.println("\r\n"
//					+ "⠀⠀⠀⠀[디지몬야구단] 임프몬⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⢀⣤⣾⣷⣶⣦⣄⡀⢀⣀⣀⣀⣠⣤⣶⣾⣿⣶⣄⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠛⠛⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠻⠷⡄⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠈⠛⢿⡏⡛⢿⣿⣿⣿⠿⢻⣿⡿⠋⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⢳⡻⠶⠉⠛⠵⡾⠺⠉⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠘⢆⡐⠂⠂⢀⡀⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠒⠾⢿⣖⣢⣴⡶⢿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⢿⣿⣷⣸⣿⣿⣿⣿⣿⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⢿⣿⠻⣿⠛⠛⣿⣹⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠀⠀⢻⣿⠛⠋⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⣀⣀⣸⣿⣀⠀⣸⣿⣧⣤⣤⣤⣄⣀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠼⠿⣿⣿⣿⣿⡿⠿⠿⠿⠿⠿⠿⠿⠟⠡⠀⠀⠀⠀⠀\r\n"
//					+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
//					+ "");
			System.out.println();
			System.out.println(
					    " ＿人人人人人人人人人人人人人人＿\r\n"
					  + "  ＞제 상대가 되시겠습니까?＜\r\n"
					  + " ￣Y^Y^Y^Y^Y^Y^Y^Y^Y￣\r\n"
					  + "　   　　┐( ∵ )┌\r\n"
					  + "　    　  ( 　) 　\r\n"
					  + "　   　 　　┘|");
		}
	}
	
}
