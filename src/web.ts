import { WebPlugin } from '@capacitor/core';

import type { CapacitorNativeBridgePlugin } from './definitions';

export class CapacitorNativeBridgeWeb extends WebPlugin implements CapacitorNativeBridgePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
