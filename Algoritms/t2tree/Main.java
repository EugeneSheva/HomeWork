package Algoritms.t2tree;
//          A
//       /     \
//      B       C
//     / \     / \
//    D   E   F   G
//   / \     / \   \
//  H   I   L   M   O

public class Main {
    public static void main(String[] args) {
        Tree root =
                new Tree('A',
                        new Tree('B', new Tree('D', new Tree('H'), new Tree('I')), new Tree('E')),
                        new Tree('C', new Tree('F', new Tree('L'), new Tree('M')), new Tree('G', null, new Tree('O'))));

        root.recursiveDepth();
        System.out.println();
        root.iterativeDepth(root);
        System.out.println();
        root.iterativeWidth(root);

    }
}

