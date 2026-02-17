# Todo Frontend

Simple React + Vite frontend for the Todo backend.

Run locally:

```bash
cd frontend
npm install
npm run dev
```

Defaults to `http://localhost:8080` for the backend API. To change backend URL set `VITE_API_BASE`, e.g.:

```bash
VITE_API_BASE=http://localhost:8080 npm run dev
```

If the backend serves on a different origin, enable CORS on the backend or adjust `VITE_API_BASE` accordingly.
