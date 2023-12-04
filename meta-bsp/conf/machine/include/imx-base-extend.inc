# This file is included from meta-freescale/conf/machine/include/imx-base.inc
# and provides a simple mechanism to override settings in the file

# Update i.MX 8ULP
IMX_EXTRA_FIRMWARE:mx8ulp-generic-bsp = "firmware-upower firmware-ele-imx"

# Update i.MX 93
IMX_SOC_REV:mx93-generic-bsp  ?= "A1"
IMX_EXTRA_FIRMWARE:mx93-generic-bsp = "imx-boot-firmware-files firmware-ele-imx"

# Add new SoC i.MX 95
DEFAULTTUNE:mx95-nxp-bsp   ?= "armv8a-crc-crypto"

MACHINEOVERRIDES_EXTENDER:mx95:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:imxdpu:imxgpu:imxgpu2d:imxgpu3d:mx9-generic-bsp:mx9-nxp-bsp:mx95-generic-bsp:mx95-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx95:use-mainline-bsp  = "imx-generic-bsp:imx-mainline-bsp:mx9-generic-bsp:mx9-mainline-bsp:mx95-generic-bsp:mx95-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx95"
MACHINE_SOCARCH_SUFFIX:mx95-nxp-bsp = "-mx95"
IMX_EXTRA_FIRMWARE:mx95-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx imx-system-manager imx-oei"
MACHINE_FIRMWARE:append:mx95-nxp-bsp  = " firmware-imx-vpu-imx95"
SECO_FIRMWARE_NAME:mx95-generic-bsp ?= "mx95${IMX_SOC_REV_LOWER}-ahab-container.img"

# Add new machine i.MX 8M Plus UltraLite
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-nxp-bsp = "imx-generic-bsp:imx-nxp-bsp:imxfbdev:mx8-generic-bsp:mx8-nxp-bsp:mx8m-generic-bsp:mx8m-nxp-bsp:mx8mpul-generic-bsp:mx8mpul-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx8mpul:use-mainline-bsp = "imx-generic-bsp:imx-mainline-bsp:mx8-generic-bsp:mx8-mainline-bsp:mx8m-generic-bsp:mx8m-mainline-bsp:mx8mpul-generic-bsp:mx8mpul-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx8mpul"
MACHINE_SOCARCH_SUFFIX:mx8mpul-nxp-bsp = "-mx8mpul"

# Add new machine i.MX 91 Phantom
IMX_SOC_REV:mx91p-generic-bsp ?= "A1"
SECO_FIRMWARE_NAME:mx91p-generic-bsp ?= "mx93${IMX_SOC_REV_LOWER}-ahab-container.img"
MACHINEOVERRIDES_EXTENDER:mx91p:use-nxp-bsp  = "imx-generic-bsp:imx-nxp-bsp:imxdrm:mx9-generic-bsp:mx9-nxp-bsp:mx91p-generic-bsp:mx91p-nxp-bsp"
MACHINEOVERRIDES_EXTENDER:mx91p:use-mainline-bsp  = "imx-generic-bsp:imx-mainline-bsp:mx9-generic-bsp:mx9-mainline-bsp:mx91p-generic-bsp:mx91p-mainline-bsp"
MACHINEOVERRIDES_EXTENDER_FILTER_OUT += "mx91p"
MACHINE_SOCARCH_SUFFIX:mx91p-nxp-bsp = "-mx91"
IMX_EXTRA_FIRMWARE:mx91p-nxp-bsp = "imx-boot-firmware-files firmware-ele-imx"

# Add new variabe for ELE extra Firmware
SECOEXT_FIRMWARE_NAME ?= "UNDEFINED"
SECOEXT_FIRMWARE_NAME:mx8ulp-generic-bsp ?= "mx8ulp${IMX_SOC_REV_LOWER}ext-ahab-container.img"

# Extend imx-base.inc for mali
PREFERRED_PROVIDER_virtual/egl:mx95-nxp-bsp        ?= "mali-imx"
PREFERRED_PROVIDER_virtual/libgles1:mx95-nxp-bsp   ?= "mali-imx"
PREFERRED_PROVIDER_virtual/libgles2:mx95-nxp-bsp   ?= "mali-imx"
PREFERRED_PROVIDER_virtual/libgles3:mx95-nxp-bsp   ?= "mali-imx"
PREFERRED_PROVIDER_opencl-clhpp:mx95-nxp-bsp       ?= "mali-imx"
PREFERRED_PROVIDER_opencl-headers:mx95-nxp-bsp     ?= "mali-imx"
PREFERRED_PROVIDER_opencl-icd-loader:mx95-nxp-bsp  ?= "mali-imx"
PREFERRED_PROVIDER_virtual/opencl-icd:mx95-nxp-bsp ?= "mali-imx"

PREFERRED_PROVIDER_virtual/libgl:imxgpu   ?= "mesa-gl"
PREFERRED_PROVIDER_virtual/libgl:imxgpu3d  = "mesa-gl"
PREFERRED_PROVIDER_virtual/mesa:imxgpu    ?= "mesa-gl"

# i.MX 6 & 7 stay on weston 10.0 for fbdev
PREFERRED_VERSION_weston:mx6-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:mx7-nxp-bsp ??= "10.0.5.imx"
PREFERRED_VERSION_weston:imx-nxp-bsp ??= "12.0.3.imx"

PREFERRED_VERSION_wayland-protocols:mx6-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx7-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx8-nxp-bsp ??= "1.32.imx"
PREFERRED_VERSION_wayland-protocols:mx9-nxp-bsp ??= "1.32.imx"

PREFERRED_VERSION_spirv-headers:imxvulkan            ??= "1.3.261.1"
PREFERRED_VERSION_spirv-tools:imxvulkan              ??= "1.3.261.1"
PREFERRED_VERSION_vulkan-headers:imxvulkan           ??= "1.3.261.1"
PREFERRED_VERSION_vulkan-loader:imxvulkan            ??= "1.3.261.1"
PREFERRED_VERSION_vulkan-tools:imxvulkan             ??= "1.3.261.1"
PREFERRED_VERSION_vulkan-validation-layers:imxvulkan ??= "1.3.261.1"

PREFERRED_VERSION_ffmpeg ??= "4.4.1"

PREFERRED_VERSION_libdrm:mx6-nxp-bsp ??= "2.4.116.imx"
PREFERRED_VERSION_libdrm:mx7-nxp-bsp ??= "2.4.116.imx"
PREFERRED_VERSION_libdrm:mx8-nxp-bsp ??= "2.4.116.imx"
PREFERRED_VERSION_libdrm:mx9-nxp-bsp ??= "2.4.116.imx"

PREFERRED_VERSION_optee-client:mx6-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx7-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx8-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-client:mx9-nxp-bsp ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx6-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx7-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx8-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os:mx9-nxp-bsp     ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx6-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx7-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx8-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-test:mx9-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx6-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx7-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx8-nxp-bsp   ??= "4.0.0.imx"
PREFERRED_VERSION_optee-os-tadevkit:mx9-nxp-bsp   ??= "4.0.0.imx"

PREFERRED_VERSION_opencv:mx8-nxp-bsp ??= "4.8.1.imx"
PREFERRED_VERSION_opencv:mx9-nxp-bsp ??= "4.8.1.imx"

SOC_DEFAULT_IMAGE_FSTYPES = "wic.bmap wic.zst tar.zst"
ZSTD_COMPRESSION_LEVEL ?= "-10"
