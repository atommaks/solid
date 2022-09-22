# Solid

## Введение
Принципы solid:
1. Принцип единственной ответсвенности (SRP - Single Responsibility Principle)
2. Принцип открытости/закрытости (OCP - Open/Close Principle)
3. Принцип подстановки Барбары Лисков (LSP - Liskov's Substitution Principle)
4. Принцип разделения интерфейсов (ISP - Interface Segregation Principle)
5. Принцип инверсии зависимостей (DIP - Dependency Inversion Principle)

## Принцип единственной ответсвенности (SRP - Single Responsibility Principle)
<p>Класс должен иметь только одну и только одну причину для изменений. Т.е. у него должна быть своя некая роль, которая
изменяется только по единственной причине. У класса должна быть своя маленькая зона ответсвенности.</p>

<p><a href="src/main/java/ru/atom/solid/srp/violation/Phone.java">Пример нарушения приницпа SRP</a></p>
<p><a href="src/main/java/ru/atom/solid/srp/solution/Phone.java">Пример исправления нарушения</a></p>


## Дополнительно
### Устойчивость
Зависимости должны быть направлены в сторону устойчивости.
<p>Устойчивость расчитывается по формуле <i>I = fan_out / (fan_out + fan_in)</i>, где </p>
<p><i>fan_out</i> - количество исходящих 
зависимостей. Эта метрика определяет количество классов внутри данного компонента, зависящих от классов за его
пределами.</p>
<p><i>fan_in</i> количество входящих зависимостей. Эта метрика определяет количество классов вне данного компонента,
которые зависят от классов внутри компонента.</p>
<p>I = 1 - максимально неустойчивый компонент, I = 0 - максимально устойчивый компонент. Изменяемые компоненты находятся
вверху и зависят от устойчивого компонента внизу. Размещение неустойчивых компонентов в верхней части диаграммы — 
общепринятое и очень удобное соглашение, потому что любые стрелки, направленные вверх, ясно покажут нарушение принципа
устойчивых зависимостей (и, как вы убедитесь далее, принципа ацикличности зависимостей).</p>

### Абстрактность
<p>Мерой абстрактности компонента служит метрика <i>A</i>. Ее значение определяется простым отношением количества
интерфейсов и абстрактных классов к общему числу классов в компоненте.</p>

- _Nc_: число классов в компоненте. 
- _Na_: число абстрактных классов и интерфейсов в компоненте.
- _A_: абстрактность. _A = Na ÷ Nc_.

<p>Значение метрики A изменяется в диапазоне от 0 до 1. 0 означает полное отсутствие абстрактных классов в компоненте, 
а 1 означает, что компонент не содержит ничего, кроме абстрактных классов.</p>

### Главная последовательность
<p>Теперь мы можем определить зависимость между устойчивостью (I) и абстрактностью (A). В идеале классы должны
находиться в зоне главной последовательности.</p>
<img src="/src/main/resources/images/zones.png" style="height: 400px; width:400px;" title="Зоны исключения" alt=""/>
<p><b>Зона боли</b>: Такие компоненты нежелательны, потому что слишком жесткие. Их нельзя расширить, потому что они 
неабстрактные, и очень трудно изменить из-за большой устойчивости.</p>
<p><b>Зона бесполезности</b>: Такие компоненты также нежелательны, потому что они максимально абстрактны и не имеют 
входящих зависимостей. Они бесполезны.</p>

### Связность компонентов
- **REP**: Reuse/Release Equivalence Principle — принцип эквивалентности повторного использования и выпусков. 
Единица повторного использования есть единица выпуска(крч надо все версионировать).
- **CCP**: Common Closure Principle — принцип согласованного изменения. В один компонент должны включаться классы,
изменяющиеся по одним причинам и в одно время. В разные компоненты должны включаться классы, изменяющиеся в разное время
и по разным причинам.
- **CRP**: Common Reuse Principle — принцип совместного повторного использования. Не вынуждайте пользователей компонента
зависеть от того, чего им не требуется.