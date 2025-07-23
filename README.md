# TourGuide App 🗺️

Um aplicativo Android de guia turístico desenvolvido como projeto do curso de Android da Udacity. O app apresenta informações sobre diferentes tipos de locais em uma cidade, organizados em categorias navegáveis através de abas.

## 📱 Sobre o Projeto

O TourGuide é um aplicativo que funciona como um guia de turismo digital, permitindo aos usuários explorar diferentes categorias de locais de interesse em uma cidade. Cada categoria é apresentada em uma aba separada com informações detalhadas sobre os estabelecimentos.

## ✨ Funcionalidades

- **Interface com Abas**: Navegação intuitiva entre 4 categorias principais
- **Listas Organizadas**: Cada categoria apresenta uma lista de locais relevantes
- **Visualização de Imagens**: Toque nos itens para ver imagens em tela cheia
- **Informações Detalhadas**: Nome, endereço e telefone de cada local
- **Interface Responsiva**: Adaptável a diferentes tamanhos de tela

## 🏢 Categorias Disponíveis

### 🏥 Hospitais
Lista de hospitais e serviços médicos da cidade

### 🏨 Hotéis
Opções de hospedagem para turistas e visitantes

### 🌳 Parques
Áreas verdes e espaços de lazer para recreação

### 🛍️ Lojas
Estabelecimentos comerciais e pontos de compras

## 🛠️ Tecnologias Utilizadas

- **Java** - Linguagem principal de desenvolvimento
- **Android SDK** - Framework para desenvolvimento Android
- **ViewPager** - Para navegação entre fragmentos
- **TabLayout** - Interface de abas
- **Fragments** - Organização modular da UI
- **ListView** - Exibição de listas
- **Custom Adapters** - Adaptadores personalizados para as listas

## 📁 Estrutura do Projeto

```
app/src/main/java/com/android/rafael/tourguide/
├── MainActivity.java              # Atividade principal com ViewPager
├── SimpleFragmentPagerAdapter.java # Adaptador para as abas
├── Location.java                  # Modelo de dados para locais
├── LocationAdapter.java          # Adaptador customizado para ListView
├── PhotoActivity.java            # Atividade para visualizar imagens
├── HospitalsFragment.java        # Fragmento dos hospitais
├── HotelsFragment.java           # Fragmento dos hotéis
├── ParksFragment.java            # Fragmento dos parques
└── ShopsFragment.java            # Fragmento das lojas
```

## 🚀 Como Executar

### Pré-requisitos
- Android Studio
- JDK 8 ou superior
- Android SDK (API Level 16+)
- Dispositivo Android ou Emulador

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/RafaelAlvesDS/Tourguide.git
   ```

2. **Abra no Android Studio**
   - Abra o Android Studio
   - Selecione "Open an existing Android Studio project"
   - Navegue até a pasta do projeto e selecione

3. **Sincronize o Gradle**
   - Aguarde o Android Studio sincronizar as dependências
   - Se necessário, clique em "Sync Now"

4. **Execute o aplicativo**
   - Conecte um dispositivo Android ou inicie um emulador
   - Clique no botão "Run" ou pressione Shift + F10

## 🎓 Contexto Educacional

Este projeto foi desenvolvido como parte do curso **Android Basics** da Udacity. Os principais conceitos aprendidos incluem:

- Criação de interfaces com múltiplas abas
- Uso de Fragments para organização modular
- Implementação de adapters personalizados
- Navegação entre activities
- Tratamento de eventos de clique
- Organização de recursos (layouts, strings, imagens)

## 📋 Requisitos do Projeto Udacity

- ✅ Pelo menos 4 listas de locais relacionados
- ✅ Navegação adequada entre as listas
- ✅ Layout customizado para os itens da lista
- ✅ Pelo menos uma imagem por local
- ✅ Informações relevantes sobre cada local

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais como parte do curso da Udacity.

## 👤 Autor

**Rafael Alves**
- GitHub: [@RafaelAlvesDS](https://github.com/RafaelAlvesDS)

---

*Projeto desenvolvido com 💜 durante o curso Android Basics da Udacity*
