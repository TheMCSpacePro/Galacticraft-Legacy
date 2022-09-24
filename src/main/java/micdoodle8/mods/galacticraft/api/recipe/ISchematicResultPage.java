/*
 * Copyright (c) 2022 Team Galacticraft
 *
 * Licensed under the MIT license.
 * See LICENSE file in the project root for details.
 */

package micdoodle8.mods.galacticraft.api.recipe;

/**
 * Implement into GUI classes for the unlocked pages
 */
public interface ISchematicResultPage
{

    /**
     * Sets the integer index in the set of pages the player has unlocked
     */
    void setPageIndex(int index);
}
