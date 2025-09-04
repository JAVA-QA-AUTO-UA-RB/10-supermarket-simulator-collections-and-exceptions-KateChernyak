# Домашнє Завдання: Симулятор Супермаркету "ShopMaster" 🛒💸

Привіт, пані та панове автоматизатори! 🌟 Ми вивчили колекції в Java 17 (Java Collections Framework) та винятки (main.java.OutOfStockException). Час створити ООП-симулятор супермаркету "ShopMaster"! Ви – менеджер, який керує товарами, категоріями та покупками. Ця консольна гра моделює реальний магазин: товари, ціни, знижки, запаси та помилки (наприклад, "Товар закінчився! 😱"). Ваше завдання – реалізувати класи, щоб код у `SupermarketSimulator.java` запрацював без змін!

## Мета Гри 🎯
- Код у `SupermarketSimulator.java` – ваш шаблон. Реалізуйте класи та методи, щоб він запрацював.
- Використовуйте колекції (List, Set, Map) та виключення для обробки помилок.

## Завдання 📝

1. **Реалізуйте класи з колекціями в ООП-стилі:**
    - `main.java.ProductInventory`: Містить ArrayList для товарів (String). Реалізуйте методи:
        - `addProduct(String product)` – додає товар.
        - `removeProduct(String name)` – видаляє товар, кидає `main.java.OutOfStockException`, якщо товару немає.
        - `sortProducts()` – сортує товари за алфавітом (`Collections.sort()`).
        - `getProducts()` – повертає список товарів.
    - `main.java.CategoryManager`: Містить HashSet для унікальних категорій (String). Реалізуйте методи:
        - `addCategory(String category)` – додає категорію, кидає `DuplicateCategoryException`, якщо категорія існує.
        - `getCategories()` – повертає набір категорій.
    - `main.java.PriceCatalog`: Містить HashMap (ключ: String - товар, значення: Double - ціна). Реалізуйте методи:
        - `addPrice(String product, double price)` – додає ціну, кидає `IllegalArgumentException` для негативної ціни.
        - `getPrice(String product)` – повертає ціну, кидає `NoSuchProductException`, якщо товару немає.
        - `getPrices()` – повертає мапу цін.
    - `main.java.StockManager`: Містить HashMap (ключ: String - товар, значення: Integer - кількість). Реалізуйте методи:
        - `addStock(String product, int quantity)` – додає запас, кидає `IllegalArgumentException` для негативної кількості.
        - `reduceStock(String product)` – зменшує запас, кидає `main.java.OutOfStockException`, якщо запас вичерпано.
        - `getStock()` – повертає мапу запасів.
    - `main.java.ShoppingCart`: Містить ArrayList для товарів у кошику. Реалізуйте методи:
        - `addToCart(String product)` – додає товар до кошика.
        - `checkout(main.java.PriceCatalog catalog, double payment)` – обчислює суму з 10% податком і 5-15% знижкою (Math.random()), кидає `InsufficientFundsException`, якщо оплати недостатньо, або `NoSuchProductException`, якщо ціна відсутня.
        - `getCart()` – повертає список товарів у кошику.

2. **Підтримка шаблону в `SupermarketSimulator.java`:**
    - Код у `main` уже надано (див. нижче). НЕ ЗМІНЮЙТЕ його! Створіть класи та методи, щоб він працював.

3. **Додатковий челендж 🌟:**
    - У `main.java.ShoppingCart` додайте метод `printReceipt(main.java.PriceCatalog catalog)` для виведення детального чека (товари, ціни, податок, знижка).
    - Додайте акційні товари: якщо в кошику є "Milk", знижка зростає на 5%.
    - Додайте ліміт кошика (наприклад, максимум 10 товарів), кидайте custom виняток `CartLimitExceededException`.

## Підказки 🛠
- Використовуйте інкапсуляцію: приватні поля, публічні методи.
- Переконайтеся, що методи повертають копії колекцій (наприклад, `new ArrayList<>(products)`), щоб уникнути прямого доступу.
- Для знижки в `checkout` використовуйте `Math.random() * 0.1 + 0.05` (5-15%).
- Додайте дружні повідомлення при виключеннях, наприклад, "Товар закінчився! Спробуйте інший. 🛑".


Використовуйте ООП-принципи (інкапсуляція, методи), цикли, if-else. Додайте свої ідеї, наприклад, ліміт кошика чи акційні товари! Успіхів, станьте топ-менеджерами! 🏆