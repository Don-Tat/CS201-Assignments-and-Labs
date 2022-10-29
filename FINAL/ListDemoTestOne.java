public class ListDemoTestOne {
    public static void main(String[] args) {
        StringLinkedListWithIterator list1 = new StringLinkedListWithIterator();
        list1.addANodeToStart("fuck you cj my code works");
        list1.addANodeToStart("c");
        list1.addANodeToStart("b");
        list1.addANodeToStart("a");
        list1.showList();
        list1.resetIteration();
        while (list1.moreToIterate()) {
            String nodeData = list1.getDataAtCurrent();
            list1.insertNodeAfterCurrent(nodeData);
            list1.goToNext();
            list1.goToNext();
        }
        System.out.println("Duplicates every item of list: ");
        list1.showList();
    }
}