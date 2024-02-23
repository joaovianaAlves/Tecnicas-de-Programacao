import java.util.Scanner;
public class Ex06 {
        private String[][] agenda;

        public Ex06() {
            // Inicializa a agenda com 5 dias (segunda a sexta) e 4 horários (8, 9, 10, 11)
            this.agenda = new String[5][4];
        }

        public void agendar(int dia, int horario, String paciente) {
            if (agenda[dia - 2][horario - 8] == null) {
                agenda[dia - 2][horario - 8] = paciente;
                System.out.println("Agendamento realizado com sucesso para " + paciente + " no dia " + obterNomeDia(dia) + " às " + horario + "h.");
            } else {
                System.out.println("Horário indisponível para agendamento.");
            }
        }

        public void listarAgenda() {
            System.out.println("Agenda do Fisioterapeuta:");
            String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
            for (int i = 0; i < agenda.length; i++) {
                System.out.println(diasSemana[i] + ":");
                for (int j = 0; j < agenda[i].length; j++) {
                    if (agenda[i][j] != null) {
                        System.out.println("  " + (j + 8) + ":00 - " + agenda[i][j]);
                    }
                }
            }
        }

        private String obterNomeDia(int dia) {
            switch (dia) {
                case 2:
                    return "Segunda";
                case 3:
                    return "Terça";
                case 4:
                    return "Quarta";
                case 5:
                    return "Quinta";
                case 6:
                    return "Sexta";
                default:
                    return "";
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Ex06 agenda = new Ex06();

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Agendar");
                System.out.println("2. Listar Agenda");
                System.out.println("3. Fim");
                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do paciente: ");
                        String nomePaciente = scanner.next();
                        System.out.print("Digite o dia desejado (2 para segunda, 3 para terça, etc.): ");
                        int dia = scanner.nextInt();
                        System.out.print("Digite o horário desejado (8, 9, 10 ou 11): ");
                        int horario = scanner.nextInt();
                        agenda.agendar(dia, horario, nomePaciente);
                        break;
                    case 2:
                        agenda.listarAgenda();
                        break;
                    case 3:
                        System.out.println("Programa encerrado.");
                        System.exit(0);
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
    }
