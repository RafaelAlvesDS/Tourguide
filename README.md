# Tour Guide

App Android de guia turístico, feito no curso de Android da Udacity. São quatro abas (hotéis, parques, lojas e hospitais) com uma lista de locais cada uma, navegáveis deslizando para os lados.

Os locais são dados de exemplo: nomes genéricos, endereço "Fake Street" e telefone zerado. O app serve para mostrar a estrutura, e para usar de verdade basta trocar a lista de cada fragment.

## Como é feito

- `MainActivity`: `ViewPager` com um `TabLayout`.
- `SimpleFragmentPagerAdapter`: liga cada aba ao seu fragment (`HotelsFragment`, `ParksFragment`, `ShopsFragment`, `HospitalsFragment`).
- `Location` e `LocationAdapter`: o modelo de cada local e o adaptador da lista.
- `PhotoActivity`: abre ao tocar em um local e mostra a foto dele.

## Rodar

Abra no Android Studio e rode em um emulador ou aparelho. O `minSdk` é 16 e o `targetSdk`, 25.
