export interface OpImageSharePlugin {
    addListener(eventName: 'imageReceived', listenerFunc: (data: {
        imageUri: string;
    }) => void): Promise<{
        remove: () => void;
    }>;
}
