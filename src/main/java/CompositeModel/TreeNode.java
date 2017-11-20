package CompositeModel;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by ddp on 2017/11/19.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node){
        children.add(node);
    }
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}
