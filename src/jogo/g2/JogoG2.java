
package jogo.g2;
import java.util.Scanner;
import java.util.Random;
public class JogoG2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Olá jogador escolha o jogo que deseje jogar!");
        System.out.println("+---------------------+");
        System.out.println("| 1- Quiz             |");
        System.out.println("| 2- Mastermind Senha |");
        System.out.println("+---------------------+");
        System.out.print("-> ");
        int menu = in.nextInt();
        
        if (menu == 1){quizfun();}
        else if (menu == 2) {
            System.out.println("");
            System.out.println("");
            System.out.println("    +------------------+");
            System.out.println("    | Mastermind Senha |");
            System.out.println("    +------------------+");
            System.out.println("");
            System.out.println("(Digite o número referente a opção!)");
            System.out.println("");
            System.out.println("");
            System.out.println("+-------------+");
            System.out.println("| MENU:       |");
            System.out.println("| 1- Play     |");
            System.out.println("| 2- Tutorial |");
            System.out.println("+-------------+");
            System.out.print("-> ");
            int menu1 = in.nextInt();
            System.out.println("");
            System.out.println("");
            
            
            int rand[] = new int[4];
            switch(menu1){
            
                case 1:
                    
                    System.out.println("+-------------------------+");
                    System.out.println("| SELECIONE A DIFICULDADE |");
                    System.out.println("| 1- Normal               |");
                    System.out.println("| 2- Difícil              |");
                    System.out.println("| 3- Extremo              |");
                    System.out.println("+-------------------------+");
                    System.out.print("-> ");
                    int menu2 = in.nextInt();
                    if (menu2 == 1){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("A senha possui 4 dígitos de 0 a 9!");     
                        System.out.println("Tente adivinhar a senha! Boa sorte °v° ");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Gerando senha...");
                        System.out.println("Senha gerada com sucesso!");
                        Random aleatorio = new Random(); 
                    
                        rand[0] = aleatorio.nextInt(10);
                        rand[1] = aleatorio.nextInt(10);
                        rand[2] = aleatorio.nextInt(10);
                        rand[3] = aleatorio.nextInt(10);                      
                        for (int i = 0; i < 4; i++){
                            for (int j = 0; j < 4; j++){
                                do {
                                if (rand[i] == rand[j] && i != j){
                                    rand[i] = aleatorio.nextInt(10);
                                }
                                }while(rand[i] == rand[j] && i != j);
                            }
                        }
                        
                    int v[] = new int[4];
                    int num[] = new int[4];
                    int qtdce;
                    int qtdcc;
                    int rep = 1;
                    
                    do {
                        qtdcc = 0;
                        qtdce = 0;
                        v[0] = rand[0];
                        v[1] = rand[1];
                        v[2] = rand[2];
                        v[3] = rand[3];
                        System.out.println("Tente acertar o números (Tentavivas restantes: "+ (13-rep)+ "):");
                        for (int i = 0; i < 4; i++) {
                            System.out.print("-> ");
                            num[i] = in.nextInt();
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
				if (num[i] == v[j]) {
                                    if (num[i] == v[i]) {
					qtdcc++;
                                    }else {
					qtdce++;
                                    }				
				}
                            }		
                        }
                        if (qtdce == 0 && qtdcc == 0 ) {
                            System.out.println("|Todos os números estão errados|");
                        }else if (qtdcc == 4) {
                            System.out.println("|Todos os números estão certos!|");
                        }else if (qtdce == 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa|");
                        }else if (qtdce != 0 && qtdcc == 0) {
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }else if (qtdce != 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa |");
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }
                        rep++;
                        
                        }while (qtdcc != 4 && rep <= 12);
                            System.out.println("A senha era "+ v[0]+ v[1]+ v[2]+ v[3]);
                            System.out.println("FIM");
                    }else if (menu2 == 2){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("A senha possui 4 dígitos de 0 a 9!");     
                        System.out.println("Tente adivinhar a senha! Boa sorte °v° ");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Gerando senha...");
                        System.out.println("Senha gerada com sucesso!");
                        Random aleatorio = new Random(); 
                    
                        rand[0] = aleatorio.nextInt(10);
                        rand[1] = aleatorio.nextInt(10);
                        rand[2] = aleatorio.nextInt(10);
                        rand[3] = aleatorio.nextInt(10);                      
                        for (int i = 0; i < 4; i++){
                            for (int j = 0; j < 4; j++){
                                do {
                                if (rand[i] == rand[j] && i != j){
                                    rand[i] = aleatorio.nextInt(10);
                                }
                                }while(rand[i] == rand[j] && i != j);
                            }
                        }
                        
                    int v[] = new int[4];
                    int num[] = new int[4];
                    int qtdce;
                    int qtdcc;
                    int rep = 1;
                    
                    do {
                        qtdcc = 0;
                        qtdce = 0;
                        v[0] = rand[0];
                        v[1] = rand[1];
                        v[2] = rand[2];
                        v[3] = rand[3];
                        System.out.println("Tente acertar o números (Tentavivas restantes: "+ (11-rep)+ "):");
                        for (int i = 0; i < 4; i++) {
                            System.out.print("-> ");
                            num[i] = in.nextInt();
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
				if (num[i] == v[j]) {
                                    if (num[i] == v[i]) {
					qtdcc++;
                                    }else {
					qtdce++;
                                    }				
				}
                            }		
                        }
                        if (qtdce == 0 && qtdcc == 0 ) {
                            System.out.println("|Todos os números estão errados|");
                        }else if (qtdcc == 4) {
                            System.out.println("|Todos os números estão certos!|");
                        }else if (qtdce == 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa|");
                        }else if (qtdce != 0 && qtdcc == 0) {
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }else if (qtdce != 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa |");
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }
                        rep++;
                        
                        }while (qtdcc != 4 && rep <= 10);
                            System.out.println("A senha era "+ v[0]+ v[1]+ v[2]+ v[3]);
                            System.out.println("FIM");
                    }else if (menu2 == 3){
                        System.out.println("");
                        System.out.println("");
                        System.out.println("A senha possui 4 dígitos de 0 a 9!");     
                        System.out.println("Tente adivinhar a senha! Boa sorte °v° ");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Gerando senha...");
                        System.out.println("Senha gerada com sucesso!");
                        Random aleatorio = new Random(); 
                    
                        rand[0] = aleatorio.nextInt(10);
                        rand[1] = aleatorio.nextInt(10);
                        rand[2] = aleatorio.nextInt(10);
                        rand[3] = aleatorio.nextInt(10);                      
                        for (int i = 0; i < 4; i++){
                            for (int j = 0; j < 4; j++){
                                do {
                                if (rand[i] == rand[j] && i != j){
                                    rand[i] = aleatorio.nextInt(10);
                                }
                                }while(rand[i] == rand[j] && i != j);
                            }
                        }
                        
                    int v[] = new int[4];
                    int num[] = new int[4];
                    int qtdce;
                    int qtdcc;
                    int rep = 1;
                    
                    do {
                        qtdcc = 0;
                        qtdce = 0;
                        v[0] = rand[0];
                        v[1] = rand[1];
                        v[2] = rand[2];
                        v[3] = rand[3];
                        System.out.println("Tente acertar o números (Tentavivas restantes: "+ (9-rep)+ "):");
                        for (int i = 0; i < 4; i++) {
                            System.out.print("-> ");
                            num[i] = in.nextInt();
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
				if (num[i] == v[j]) {
                                    if (num[i] == v[i]) {
					qtdcc++;
                                    }else {
					qtdce++;
                                    }				
				}
                            }		
                        }
                        if (qtdce == 0 && qtdcc == 0 ) {
                            System.out.println("|Todos os números estão errados|");
                        }else if (qtdcc == 4) {
                            System.out.println("|Todos os números estão certos!|");
                        }else if (qtdce == 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa|");
                        }else if (qtdce != 0 && qtdcc == 0) {
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }else if (qtdce != 0 && qtdcc != 0) {
                            System.out.println("|"+ qtdcc+ " número(s) certo(s) na posição certa |");
                            System.out.println("|"+ qtdce+ " número(s) certo(s) na posição errada|");
                        }
                        rep++;
                        
                        }while (qtdcc != 4 && rep <= 8);
                            System.out.println("A senha era "+ v[0]+ v[1]+ v[2]+ v[3]);
                            System.out.println("FIM");
                    }
                        
                        
                    break;
                case 2:
                    System.out.println("~------------------------------------------------~");
                    System.out.println("| O jogador possui, por padrão, 12 chances de    |");
                    System.out.println("| acertar o número aleatório gerado por uma IA!  |");
                    System.out.println("~------------------------------------------------~");
                    
                    System.out.println("Vamos utilizar a senha 1234 como exemplo.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Tente adivinhar a senha(um dígito de cada vez)! ");
                    System.out.println("->  2 ");
                    System.out.println("->  9 ");
                    System.out.println("->  7 ");
                    System.out.println("->  4 ");
                    System.out.println("Dos quatro dígitos escolhidos, o '2' faz parte da senha, mas está na posição errada e o '4' faz");
                    System.out.println("parte da senha e está na posição certa. Os outros números escohlidos não fazem parte da senha.");
                    System.out.println("Essas informações(certo na posição certa/certo na posição errada) serão dadas ao terminar");
                    System.out.println("os palpites da tentativa, sem especificar os dígitos.");
                    
                    System.out.println("");
                    break;
            }
        }
        else{
            System.out.println("Opção inválida!");
        }
    }
    
    
    // Funções
    
    public static void quizfun(){
            Scanner in = new Scanner(System.in);
            int acertos = 0;
            int erros = 0;
            System.out.println("");
            System.out.println("");
            System.out.println("    +------+");
            System.out.println("    | Quiz |");
            System.out.println("    +------+");
            System.out.println("");
            
            System.out.println("Digite o tipo de quiz desejado!");
            System.out.println("+--------------------------+");
            System.out.println("| 1- Perguntas Especificas |");
            System.out.println("| 2- Perguntas Gerais      |");
            System.out.println("+--------------------------+");
            System.out.print("-> ");
            int menu2 = in.nextInt();
            
            if(menu2 == 2){
                
                
                System.out.println("(Digite o número referente a opção!)");
                System.out.println("");
                System.out.println("");
                System.out.println("Quanto é 1 + 1");
                System.out.print("-> ");
                int r1 = in.nextInt();
                if (r1 == 2){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Qual arma possui mais precisão ao mirar?");
                System.out.println("");
                System.out.println("1 - Aug");
                System.out.println("2 - Scout");
                System.out.println("3 - AWP");
                System.out.println("4 - G3SG 1");
                System.out.print("-> ");
                
                int r2 = in.nextInt();
                if (r2 == 3){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                
                System.out.println("Quem possui AK-47?");
                System.out.println("");
                System.out.println("1- Contraterroristas (CT)");
                System.out.println("2- Terroristas (TR)");
                System.out.print("-> ");
                int r3 = in.nextInt();
                if (r3 == 2){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                 
                System.out.println("Qual foi a empresa que criou o Cuphead?");
                System.out.println("");
                System.out.println("1 - Ubisoft");
                System.out.println("2 - Activision Blizaard");
                System.out.println("3 - Team Cherry");
                System.out.println("4 - Studio MDHR");
                System.out.print("-> ");
                int r8 = in.nextInt();
                if (r8 == 4){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Qual o nome da agente brasileira de valorant?");
                System.out.println("");
                System.out.print("-> ");
                String r10 = in.nextLine();
                if (r10.equals("Raze")){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                
                System.out.println("Quais são  os bosses do  Minecraft?");
                System.out.println("");
                System.out.println("1 - Phanton/Blade");
                System.out.println("2 - Wither Skeleton / Pigman ");
                System.out.println("3 - Ghast/Pig");
                System.out.println("4 - EnderDragon /  Wither ");
                System.out.print("-> ");
                int r4 = in.nextInt();
                if (r4 == 4){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Qual é a empresa que criou Call of Duty?");
                System.out.println("");
                System.out.println("1 - Activision Blizaard");
                System.out.println("2 - Rockstar Games ");
                System.out.println("3 - Mojang Inc.");
                System.out.println("4 - Pulsar Gamesoft ");
                System.out.print("-> ");
                int r5 = in.nextInt();
                if (r5 == 1){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                    
                 
                System.out.println("Essa silhueta é de qe amra:?");
                System.out.println("");
                System.out.println("1 - R8 Revolver");
                System.out.println("2 - Usp-S ");
                System.out.println("3 - P250");
                System.out.println("4 - Desert Eagle ");
                              
                System.out.println("    ::!:::: . .... . . .. . ..:::::::.           :!!              "); 
                System.out.println("     .........................!!!!!!!!..::::::.!##!!#!..!!        ");
                System.out.println("     .........          :.:........     ...::::...:::::.!         ");
                System.out.println("       . !!!!!!!!!!!!!!!!!!!!!#!!!!!!!!!!#!!!!!!!###!!!!!!!!!:    ");
                System.out.println("                                !#      !!@##########!#           ");
                System.out.println("                                 #     !!!:!##########:           ");
                System.out.println("                                          !############.          ");
                System.out.println("                                          !#############!         ");
                System.out.println("                                           :############!#        ");
                System.out.println("                                            ##############!       ");
                System.out.println("                                            ##############        ");
                
                System.out.print("-> ");
                int r6 = in.nextInt();
                if (r6 == 4){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                
                 System.out.println("Essa silhueta é de qe amra:?");
                System.out.println("");
                System.out.println("1 - Glock-18");
                System.out.println("2 - CZ75-Auto ");
                System.out.println("3 - Tec-9");
                System.out.println("4 - P2000 ");
                            
                System.out.println("                                       ::                     ");                           
                System.out.println("             ::!#!#:!:!!!!!!!!!!!!!!!!!!!!!!!!!!!!##!!!###    ");      
                System.out.println("               ##:!#!!#!#!!##@@@@@@@@@@@@@@@@@@@@@@@@@@@@:    ");     
                System.out.println("                               @######@   !:#@@@@@@@@:        ");     
                System.out.println("                                ##@###@  !   ####@##:         ");     
                System.out.println("                                ######@!      :#######        ");     
                System.out.println("                                .!!!#!         !#######       ");     
                System.out.println("                                .##!#!         ######.        ");     
                System.out.println("                                .##!#!                        ");     
                System.out.println("                                .##!#!                        ");     
                System.out.println("                                :####!                        ");
                
                System.out.print("-> ");
                int r7 = in.nextInt();
                if (r7 == 1){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Em Five Nights at Freddy's até que horário você tem que sobreviver?");
                System.out.println("");
                System.out.println("1 - 4 a.m.");
                System.out.println("2 - 8 a.m. ");
                System.out.println("3 - 3 a.m.");
                System.out.println("4 - 6 a.m.");
                System.out.print("-> ");
                int r9 = in.nextInt();
                if (r9 == 4){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                

                
                
            }
            
            if(menu2 == 1){
                System.out.println("Qual das criaturas/animais tem menos pontos de vida?");
                System.out.println("");
                System.out.println("1 - Traça");
                System.out.println("2 - Smile(Pequeno) ");
                System.out.println("3 - Salmão");
                System.out.println("4 - Morcego");
                System.out.print("-> ");
                int r11 = in.nextInt();
                if (r11 == 2){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Quanto tempo maximo que a molotov pode ficar no ar? (sem uso de bugs)");
                System.out.println("");
                System.out.println("1 - 1s");
                System.out.println("2 - 5s");
                System.out.println("3 - 2s");
                System.out.println("4 - 4s");
                System.out.print("-> ");
                int r12 = in.nextInt();
                if (r12 == 3){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Quanto custa uma granada HE?");
                System.out.println("");
                System.out.println("1 - 500R$");
                System.out.println("2 - 300R$");
                System.out.println("3 - 150R$");
                System.out.println("4 - 250R$");
                System.out.print("-> ");
                int r22 = in.nextInt();
                if (r22 == 2){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                 System.out.println("Qual é o tiro que inflige mais dano em Cuphead?");
                System.out.println("");
                System.out.println("1 - Roundabout (vai e vem)");
                System.out.println("2 - Charge (tiro carregado");
                System.out.println("3 - Chaser (tiro perseguidor)");
                System.out.println("4 - Lobber (ibus)");
                System.out.print("-> ");
                int r13 = in.nextInt();
                if (r13 == 2){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(Hollow Knight) Em que local ocorre a primeira interação com zote?");
                System.out.println("");
                System.out.println("1 - Ninho Profundo");
                System.out.println("2 - Penhascos Uivantes");
                System.out.println("3 - Caminho Verde");
                System.out.println("4 - Cidade das lágrimas");
                System.out.print("-> ");
                int r14 = in.nextInt();
                if (r14 == 3){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(Hollow Knight) Onde é encontrado a Lágrima de Isma?");
                System.out.println("");
                System.out.println("1 - Cânion da Névoa");
                System.out.println("2 - Jardins da Rainha");
                System.out.println("3 - Caminho verde");
                System.out.println("4 - Hidrovia real");
                System.out.print("-> ");
                int r15 = in.nextInt();
                if (r15 == 4){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(LOL)qual é o campeão que possui a fala “...gostar de esconde esconde, brincar sempre com a receita federal”");
                System.out.println("");
                System.out.println("1 - Mundo");
                System.out.println("2 - Rammus");
                System.out.println("3 - Jarvan");
                System.out.println("4 - Riven");
                System.out.print("-> ");
                int r16 = in.nextInt();
                if (r16 == 1){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(LOL)Qual campeão que tem como ultimate “ hora do show ”?");
                System.out.println("");
                System.out.println("1 - Draven");
                System.out.println("2 - Fiora");
                System.out.println("3 - Sett");
                System.out.println("4 - Mordekaiser");
                System.out.print("-> ");
                int r17 = in.nextInt();
                if (r17 == 1){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(Terraria)O que acontece quando quando você mata WOF (Parede de carne)?");
                System.out.println("");
                System.out.println("1 - Os espíritos das trevas existentes são aniquilados do mundo");
                System.out.println("2 - Os espíritos da luz existentes são aniquilados do mundo.");
                System.out.println("3 - Os espíritos das trevas e da luz existentes são libertados ao mundo novamente");
                System.out.println("4 - Nenhuma das respostas anteriores");
                System.out.print("-> ");
                int r18 = in.nextInt();
                if (r18 == 3){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("(LOL)Qual campeão que tem como ultimate “ hora do show ”?");
                System.out.println("");
                System.out.println("1 - Draven");
                System.out.println("2 - Fiora");
                System.out.println("3 - Sett");
                System.out.println("4 - Mordekaiser");
                System.out.print("-> ");
                int r = in.nextInt();
                if (r == 1){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                System.out.println("Terraria) Qual NPC é obtido após obter todos os NPSs existentes?");
                System.out.println("");
                System.out.println("1 - Rei");
                System.out.println("2 - Zoologista");
                System.out.println("3 - Princesa");
                System.out.println("4 - Goblin");
                System.out.print("-> ");
                int r23 = in.nextInt();
                if (r23 == 3){
                    acertou();
                    acertos = acertos + 1;
                }
                else{
                    errou();
                    erros = erros + 1;
                }
                
                

            }
            
            System.out.println("Tabela de acertos:");
            System.out.println("+-------------------------+");
            System.out.println("|Número de ACERTOS: "+acertos+"    |");
            System.out.println("|Número de ERROS: "+erros+"      |");
            System.out.println("+-------------------------+");
	}
	
    
    public static void acertou(){
        System.out.println("~---------------~");
        System.out.println("< Você ACERTOU! >");
        System.out.println("~---------------~");
    }
    
     public static void errou(){
        System.out.println("~--------------~");
        System.out.println("< Você ERROU ! >");
        System.out.println("~--------------~");
    }
  
    
}

