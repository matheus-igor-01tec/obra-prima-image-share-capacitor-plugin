export interface OpImageSharePlugin {
  addListener(
    eventName: 'imageReceived',
    listenerFunc: (data: { uriImagem: string }) => void
  ): Promise<{ remove: () => void }>;
}
