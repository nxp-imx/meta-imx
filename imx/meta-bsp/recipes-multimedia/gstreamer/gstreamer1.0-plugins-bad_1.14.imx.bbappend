
SRCBRANCH = "imx-1.14.x"
SRCREV = "7e8a87fcbf5bd44b6982f6d15f2d28aa5f49a6be"

#Remove vulkan as it's incompatible for i.MX 8M Mini
PACKAGECONFIG_remove_mx8mm = " vulkan"
