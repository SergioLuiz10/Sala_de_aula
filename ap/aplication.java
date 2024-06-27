package ap;

import aluno.person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class aplication {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Map<String, person> map = new HashMap<>();
        int escolha;

        do {
            System.out.println("Digite a quantidade de alunos:");
            int quantidade = ler.nextInt();
            ler.nextLine();

            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite o nome do aluno:");
                String nome = ler.nextLine();
                System.out.println("Digite a nota do aluno:");
                double nota = ler.nextDouble();
                ler.nextLine(); // Consume newline
                map.put(nome, new person(nome, nota));
            }

            System.out.println("Digite a escolha: 1-adicionar nota, 2-atualizar, 3-subtrair, 4-consultar notas, 5-lista completa de alunos e notas, 6-sair");
            escolha = ler.nextInt();
            ler.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do aluno para adicionar nota:");
                    String nomeAdicionar = ler.nextLine();
                    if (map.containsKey(nomeAdicionar)) {
                        System.out.println("Digite a nota a ser adicionada:");
                        double notaAdicionar = ler.nextDouble();
                        ler.nextLine(); // Consume newline
                        person aluno = map.get(nomeAdicionar);
                        aluno.setNota(aluno.getNota() + notaAdicionar);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do aluno para atualizar a nota:");
                    String nomeAtualizar = ler.nextLine();
                    if (map.containsKey(nomeAtualizar)) {
                        System.out.println("Digite a nova nota:");
                        double novaNota = ler.nextDouble();
                        ler.nextLine(); // Consume newline
                        person aluno = map.get(nomeAtualizar);
                        aluno.setNota(novaNota);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno para subtrair nota:");
                    String nomeSubtrair = ler.nextLine();
                    if (map.containsKey(nomeSubtrair)) {
                        System.out.println("Digite a nota a ser subtraída:");
                        double notaSubtrair = ler.nextDouble();
                        ler.nextLine(); // Consume newline
                        person aluno = map.get(nomeSubtrair);
                        aluno.setNota(aluno.getNota() - notaSubtrair);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do aluno para consultar a nota:");
                    String nomeConsultar = ler.nextLine();
                    if (map.containsKey(nomeConsultar)) {
                        person aluno = map.get(nomeConsultar);
                        System.out.println("Nota de " + aluno.getNome() + ": " + aluno.getNota());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Lista completa de alunos e suas respectivas notas:");
                    for (Map.Entry<String, person> entry : map.entrySet()) {
                        System.out.println("Nome: " + entry.getKey() + ", Nota: " + entry.getValue().getNota());
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (escolha != 6);
    }
}
