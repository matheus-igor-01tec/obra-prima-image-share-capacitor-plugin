export interface OpImageSharePlugin {
  addListener(
    eventName: 'imageReceived',
    listenerFunc: (data: { uriImagem?: string; urisImagens?: string[] }) => void
  ): Promise<{ remove: () => void }>;
}
