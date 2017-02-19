package Visitors;

import Operations.Product;

public interface ProductVisitor<R> {

    R visit(Product product);

}
