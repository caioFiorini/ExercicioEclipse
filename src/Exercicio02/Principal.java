package Exercicio02;

public class Principal{
    public static void cabecalho(){
        System.out.println("Escolha a opcao que voce deseja:");
        System.out.println("1- Inserir um novo usuario..");
        System.out.println("2- Listar usuarios");
        System.out.println("3- Excluir um usuario");
        System.out.println("4- Atualizar algum usuario existente.");
        System.out.println("5- Para sair");
    }
    public static void main(String[] args){
    	Dao dao = new Dao();
        
        dao.conectar();
        
        String nome = " ", senha = " ", email = " ", novaSenha = " ";
        char sexo = ' ';
        int id = 0;

        cabecalho();
        int opcao = MyIO.readInt();
        
        do{   
            switch (opcao) {
                case 1:
                        System.out.println("Digite o id do Usuario:");
                        id = MyIO.readInt();
                        System.out.println("Digite o nome do Usuario:");
                        nome = MyIO.readString();
                        System.out.println("Digite a senha do Usuario:");
                        senha = MyIO.readString();
                        System.out.println("Digite o email do Usuario:");
                        email = MyIO.readString();
                        System.out.println("Digite o sexo do Usuario:");
                        sexo = MyIO.readChar();

                        Usuario usuario = new Usuario(id, nome, email, senha, sexo);
		                if(dao.inserirUsuario(usuario) == true) {
			            System.out.println("Inserção com sucesso -> " + usuario.toString());
		                }
                        
                        //dao.close();
                    break;
                case 2: 
                        System.out.println("Usuarios:");
                        Usuario[] usuarios = dao.getUsuarios();
                        for(int i = 0; i < usuarios.length; i++){
                            System.out.println(usuarios[i].toString());
                        } 
                        //dao.close();
                    break;
                case 3:
                        System.out.println("Digite o id, que voce deseja: ");
                        id = MyIO.readInt();
                        dao.excluirUsuario(id);
                        //dao.close();
                    break;
                case 4: 
                		
                		System.out.println("Digite o id do usuario que vc deseja atualizar");
                		id = MyIO.readInt();
                		System.out.println("Digite o nome do usuario que vc deseja atualizar");
                		nome = MyIO.readString();
                		System.out.println("Digite o email do usuario que vc deseja atualizar");
                		email = MyIO.readString();
                		System.out.println("Digite a senha do usuario que vc deseja atualizar");
                		senha = MyIO.readString();
                		System.out.println("Digite o sexo do usuario que vc deseja atualizar");
                		sexo = MyIO.readChar();
                	
                        Usuario usuario2 = new Usuario(id, nome, email, senha, sexo);
                        
                        System.out.println("Digite a sua nova senha:");
                        novaSenha = MyIO.readString();
                        System.out.println("Fui");
                        usuario2.setSenha(novaSenha);
                        
                        
                        System.out.println("Passei aqui");
                        dao.atualizarUsuario(usuario2);
                        //dao.close();
                    break;
                case 5: //não cair no default;
                    break;
                default:
                        System.out.println("Opcao errada");
                    break;
            }
            cabecalho();
            opcao = MyIO.readInt();
        }while(opcao != 5);
    }
}
