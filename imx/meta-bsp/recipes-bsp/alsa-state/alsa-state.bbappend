# Append path for freescale layer to include asound.conf & asound.state for i.MX8
FILESEXTRAPATHS_prepend_mx8 := "${BSPDIR}/sources/meta-fsl-arm/recipes-bsp/${PN}/${PN}/imx:"
PACKAGE_ARCH_mx8 = "${MACHINE_ARCH}"
