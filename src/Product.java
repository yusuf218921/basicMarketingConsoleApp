public class Product extends BaseProduct{
    Product(String category) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if(category.equals(Statics.categories[i][j])){
                    setCategoryId(i);
                    this.category=Statics.categories[i][1];
                }
            }
        }
    }

    Product(double price,String category, String productCompany, String productName) {
        this.price = price;
        this.productCompany = productCompany;
        this.productName = productName;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if(category.toLowerCase().equals(Statics.categories[i][j].toLowerCase())){
                    setCategoryId(i);
                    this.category=Statics.categories[i][1];

                }
            }
        }
    }
}
