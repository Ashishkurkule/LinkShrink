import { createContext, useContext, useState } from "react";

const StoreContext = createContext(null);

export const ContextProvider = ({ children }) => {
  const [token, setToken] = useState(null);

  return (
    <StoreContext.Provider value={{ token, setToken }}>
      {children}
    </StoreContext.Provider>
  );
};

export const useStoreContext = () => {
  return useContext(StoreContext);
};
