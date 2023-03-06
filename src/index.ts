import { registerPlugin } from '@capacitor/core';

import type { CapacitorNativeBridgePlugin } from './definitions';

const CapacitorNativeBridge = registerPlugin<CapacitorNativeBridgePlugin>('CapacitorNativeBridge', {
  web: () => import('./web').then(m => new m.CapacitorNativeBridgeWeb()),
});

export * from './definitions';
export { CapacitorNativeBridge };
