/**
 * Copyright (c) 2020 GregTech-6 Team
 *
 * This file is part of GregTech.
 *
 * GregTech is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * GregTech is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with GregTech. If not, see <http://www.gnu.org/licenses/>.
 */

package gregtech.blocks.stone;

import static gregapi.data.CS.*;

import gregapi.block.BlockBaseMeta;
import gregapi.data.LH;
import gregapi.data.MT;
import gregapi.data.OP;
import gregapi.old.Textures;
import gregapi.util.OM;
import gregapi.util.ST;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class BlockCrystalOres extends BlockBaseMeta {
	public BlockCrystalOres(String aUnlocalised) {
		super(null, aUnlocalised, Material.glass, soundTypeGlass, 12, Textures.BlockIcons.CRYSTAL_ORES);
		LH.add(getUnlocalizedName()+ ".0.name", "Arsenopyrite Crystal");
		LH.add(getUnlocalizedName()+ ".1.name", "Chalcopyrite Crystal");
		LH.add(getUnlocalizedName()+ ".2.name", "Cinnabar Crystal");
		LH.add(getUnlocalizedName()+ ".3.name", "Cobaltite Crystal");
		LH.add(getUnlocalizedName()+ ".4.name", "Galena Crystal");
		LH.add(getUnlocalizedName()+ ".5.name", "Kesterite Crystal");
		LH.add(getUnlocalizedName()+ ".6.name", "Molybdenite Crystal");
		LH.add(getUnlocalizedName()+ ".7.name", "Pyrite Crystal");
		LH.add(getUnlocalizedName()+ ".8.name", "Sphalerite Crystal");
		LH.add(getUnlocalizedName()+ ".9.name", "Stannite Crystal");
		LH.add(getUnlocalizedName()+".10.name", "Stibnite Crystal");
		LH.add(getUnlocalizedName()+".11.name", "Tetrahedrite Crystal");
		
		OM.reg(ST.make(this, 1, 0), OP.oreDense.dat(MT.OREMATS.Arsenopyrite));
		OM.reg(ST.make(this, 1, 1), OP.oreDense.dat(MT.OREMATS.Chalcopyrite));
		OM.reg(ST.make(this, 1, 2), OP.oreDense.dat(MT.OREMATS.Cinnabar));
		OM.reg(ST.make(this, 1, 3), OP.oreDense.dat(MT.OREMATS.Cobaltite));
		OM.reg(ST.make(this, 1, 4), OP.oreDense.dat(MT.OREMATS.Galena));
		OM.reg(ST.make(this, 1, 5), OP.oreDense.dat(MT.OREMATS.Kesterite));
		OM.reg(ST.make(this, 1, 6), OP.oreDense.dat(MT.OREMATS.Molybdenite));
		OM.reg(ST.make(this, 1, 7), OP.oreDense.dat(MT.Pyrite));
		OM.reg(ST.make(this, 1, 8), OP.oreDense.dat(MT.OREMATS.Sphalerite));
		OM.reg(ST.make(this, 1, 9), OP.oreDense.dat(MT.OREMATS.Stannite));
		OM.reg(ST.make(this, 1,10), OP.oreDense.dat(MT.OREMATS.Stibnite));
		OM.reg(ST.make(this, 1,11), OP.oreDense.dat(MT.OREMATS.Tetrahedrite));
		
		if (COMPAT_IC2 != null) {
		COMPAT_IC2.valuable(this,  0, 1);
		COMPAT_IC2.valuable(this,  1, 1);
		COMPAT_IC2.valuable(this,  2, 1);
		COMPAT_IC2.valuable(this,  3, 1);
		COMPAT_IC2.valuable(this,  4, 1);
		COMPAT_IC2.valuable(this,  5, 1);
		COMPAT_IC2.valuable(this,  6, 1);
		COMPAT_IC2.valuable(this,  7, 1);
		COMPAT_IC2.valuable(this,  8, 1);
		COMPAT_IC2.valuable(this,  9, 1);
		COMPAT_IC2.valuable(this, 10, 1);
		COMPAT_IC2.valuable(this, 11, 1);
		COMPAT_IC2.valuable(this, 12, 1);
		COMPAT_IC2.valuable(this, 13, 1);
		COMPAT_IC2.valuable(this, 14, 1);
		COMPAT_IC2.valuable(this, 15, 1);
		}
	}
	
	@Override public boolean useGravity(byte aMeta) {return F;}
	@Override public boolean doesWalkSpeed(byte aMeta) {return F;}
	@Override public boolean doesPistonPush(byte aMeta) {return T;}
	@Override public boolean canCreatureSpawn(byte aMeta) {return T;}
	@Override public boolean isSealable(byte aMeta, byte aSide) {return F;}
	@Override public String getHarvestTool(int aMeta) {return TOOL_pickaxe;}
	@Override public int getHarvestLevel(int aMeta) {return 0;}
	@Override public int getFlammability(byte aMeta) {return 0;}
	@Override public int getFireSpreadSpeed(byte aMeta) {return 0;}
	@Override public float getBlockHardness(World aWorld, int aX, int aY, int aZ) {return Blocks.glowstone.getBlockHardness(aWorld, aX, aY, aZ);}
	@Override public float getExplosionResistance(byte aMeta) {return Blocks.glowstone.getExplosionResistance(null);}
}