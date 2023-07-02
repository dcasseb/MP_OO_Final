package model.util;

import java.util.ArrayList;

public class Escritorio {
    private static ArrayList<Filial> filiais = new ArrayList<>();
    private static String endereco;

    public Escritorio(String endereco) {
        Escritorio.endereco = endereco;
    }

    public static ArrayList<Filial> getFiliais() {
        return new ArrayList<>(filiais);
    }
    
    public void setFiliais(ArrayList<Filial> filiais) {
        Escritorio.filiais = new ArrayList<>(filiais);
    }

    public static void adicionarFilial(String endereco, String cnpj) {
        if (filiais != null) {
            Filial filial = new Filial(endereco, cnpj);
            filiais.add(filial);
        }
    }

    public static void adicionarFilial(Filial filial) {
        if (filiais != null) {
            filiais.add(filial);
        }
    }

    public static void editarFilial(String enderecoAtual, String novoEndereco) {
        if (filiais != null) {
            for (Filial filial : filiais) {
                if (filial.getEndereco().equals(enderecoAtual)) {
                    filial.setEndereco(novoEndereco);
                    break;
                }
            }
        }
    }

    public static void excluirFilial(Filial filial) {
        if (filiais != null) {
            filiais.remove(filial);
        }
    }

    public static void listarPatrimoniosMatriz() {
        if (filiais != null) {
            for (Filial filial : filiais) {
                if (filial.getEndereco().equalsIgnoreCase("Matriz")) {
                    System.out.println("Patrimônios da Matriz:");
                    ArrayList<Patrimonio> patrimonios = filial.getPatrimonio();
                    if (patrimonios != null) {
                        for (Patrimonio patrimonio : patrimonios) {
                            System.out.println(patrimonio);
                        }
                    } else {
                        System.out.println("Não há patrimônios cadastrados para a Matriz.");
                    }
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Escritorio [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

    public static ArrayList<Patrimonio> getListaFilial() {
        ArrayList<Patrimonio> listaPatrimonios = new ArrayList<>();
        if (filiais != null) {
            for (Filial filial : filiais) {
                ArrayList<Patrimonio> patrimonios = filial.getPatrimonio();
                if (patrimonios != null) {
                    listaPatrimonios.addAll(patrimonios);
                }
            }
        }
        return listaPatrimonios;
    }
}
