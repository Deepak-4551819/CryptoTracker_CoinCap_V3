# 🪙 CryptoTracker

A sleek and responsive crypto tracking app built in **Jetpack Compose** with **Ktor** networking and real-time asset price support via CoinCap API 3.0. 🔥

---

## 🚀 Features

- ⚡ View top crypto assets with live price updates
- 📊 Historical price charts for any coin
- 🌗 Adaptive list-detail layout for tablets and large screens
- 🛠 Robust error handling with clean `Result<T, NetworkError>` API design
- 🎯 Compose-first UI with smooth transitions and state management

---

## 🧠 Tech Stack

| Layer           | Technology       |
|----------------|------------------|
| UI             | Jetpack Compose  |
| Networking     | Ktor (CIO engine)|
| Architecture   | MVVM + Clean Layering |
| DI             | Koin             |
| Time Utilities | `ZonedDateTime`, `ZoneId` for UTC conversion |
| API            | CoinCap REST API v3.0 |

---

## 🔄 Migrating from CoinCap API v2 to v3

This project uses CoinCap **API v3.0**. If you were using **v2.0**, here's what changed:

### ✅ Migration Checklist

| Element           | v2                      | v3                     |
|-------------------|-------------------------|------------------------|
| Base REST URL     | `https://api.coincap.io/v2/` | `https://rest.coincap.io/v3/` |
| WebSocket URL     | `wss://ws.coincap.io/`       | `wss://wss.coincap.io/`       |
| Auth              | ❌ No key required       | ✅ Requires `Bearer` token     |
| Example Call      | `/assets`               | `/assets?apiKey=YourApiKey`  |

To use v3:
```kotlin
header("Authorization", "Bearer YourApiKey")
```

## 📁 Project Structure

```text
CryptoTracker/
├── data/
│   ├── source/         # Remote data fetching (CoinDataSource, RemoteCoinDataSource)
│   ├── model/          # DTOs and domain models (Coin, CoinPrice, etc.)
│   └── network/        # Ktor setup: HttpClientFactory, safeCall, error mapping
│
├── ui/
│   ├── coinlist/       # Coin list screen with adaptive layout
│   ├── coindetail/     # Detailed view with historical charts
│   ├── components/     # Reusable Composables (loading, error, charts)
│   └── adaptivepane/   # List-detail layout and navigator scaffold
│
├── viewmodel/
│   └── CoinListViewModel  # StateFlow, user actions, UI state logic
│
├── util/
│   └── extensions/     # URL builders, time utilities, error mappers
│
└── di/
    └── AppModule       # Koin dependency injection setup
```



---

## 🔧 Quick Start

1. **Clone the repo**
   ```bash
   git clone https://github.com/Deepak-4551819/CryptoTracker.git
   cd CryptoTracker
   ```
2. Add your CoinCap API key
Create or update local.properties in your project root:
 ```bash
   COINCAP_API_KEY=your_api_key_here
   ```
3. Build and run the app
    ```bash
   ./gradlew build
   ./gradlew installDebug
   ```



# 📸 Screenshots
The CryptoTracker app offers a consistent and adaptive experience in both portrait and landscape modes, supporting system-wide light and dark themes.

#🔆 Light Theme
| 🏠 Home (Portrait)                                                                                          | 📆 Detail (Portrait)                                                                                            | 🌐 Landscape Mode                                                                                                     |
| ----------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| ![Home Light](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/Home%20Light.jpg) | ![Detail Light](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/Detail%20Light.jpg) | ![Landscape Light](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/LandScape%20Light.jpg) |

#🌙 Dark Theme
| 🏠 Home (Portrait)                                                                                        | 📆 Detail (Portrait)                                                                                          | 🌐 Landscape Mode                                                                                                   |
| --------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| ![Home Dark](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/Home%20Dark.jpg) | ![Detail Dark](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/Detail%20Dark.jpg) | ![Landscape Dark](https://github.com/Deepak-4551819/CryptoTracker_CoinCap_V3/blob/ba0698d90faa2b2aa34ac1f03342dee0bd548bbd/Screenshot/LandScape%20Dark.jpg) |

# 🤝 Contributing
Contributions are welcome!
You can:

- ⭐ Star the repo
- 📥 Fork the project
- 🔧 Submit a pull request
- 🐛 Report issues or bugs

# 📜 License
This project is licensed under the MIT License.

