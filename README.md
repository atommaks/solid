# Solid

### Введение
Принципы solid:
1. Принцип единственной ответсвенности (SRP - Single Responsibility Principle)
2. Принцип открытости/закрытости (OCP - Open/Close Principle)
3. Принцип подстановки Барбары Лисков (LSP - Liskov's Substitution Principle)
4. Принцип разделения интерфейсов (ISP - Interface Segregation Principle)
5. Принцип инверсии зависимостей (DIP - Dependency Inversion Principle)

### Принцип единственной ответсвенности (SRP - Single Responsibility Principle)
<p>Класс должен иметь только одну и только одну причину для изменений. Т.е. у него должна быть своя некая роль, которая
изменяется только по единственной причине. У класса должна быть своя маленькая зона ответсвенности.</p>

<p><a href="https://github.com/atommaks/solid/src/main/java/ru/atom/solid/srp/violation/Phone.java">Пример нарушения приницпа SRP</a></p>
<p><a href="https://github.com/atommaks/solid/src/main/java/ru/atom/solid/srp/solution/Phone.java">Пример исправления нарушения</a></p>
