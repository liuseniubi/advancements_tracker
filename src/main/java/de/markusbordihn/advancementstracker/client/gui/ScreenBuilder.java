/**
 * Copyright 2021 Markus Bordihn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.markusbordihn.advancementstracker.client.gui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.markusbordihn.advancementstracker.Constants;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;

public abstract class ScreenBuilder extends Screen {

  protected ScreenBuilder(String title) {
    super(getText(title));
  }

  protected ScreenBuilder(String title, Object object) {
    super(getText(title, object));
  }

  public static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public static TranslationTextComponent getText(String translationKey) {
    return new TranslationTextComponent(Constants.MOD_PREFIX + translationKey);
  }

  public static TranslationTextComponent getText(String translationKey, Object object) {
    return new TranslationTextComponent(Constants.MOD_PREFIX + translationKey, object);
  }

}
