public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int info) {
        raiz = inserirRecursivo(raiz, info);
    }

    private Node inserirRecursivo(Node raiz, int info) {
        if (raiz == null) {
            raiz = new Node(info);
            return raiz;
        }

        if (info < raiz.info) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, info);
        } else if (info > raiz.info) {
            raiz.direita = inserirRecursivo(raiz.direita, info);
        }

        return raiz;
    }

    public void percorrerPreOrdem(Node node) {
        if (node != null) {
            System.out.print(node.info + " ");
            percorrerPreOrdem(node.esquerda);
            percorrerPreOrdem(node.direita);
        }
    }

    public void percorrerPreOrdem() {
        percorrerPreOrdem(raiz);
    }
}
