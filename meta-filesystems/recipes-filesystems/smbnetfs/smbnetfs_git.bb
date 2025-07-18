SUMMARY = "FUSE module for mounting an entire SMB/NMB network in a single directory"
DESCRIPTION = "SMBNetFS is a Linux/FreeBSD filesystem that allow you to use \
               samba/microsoft network in the same manner as the network \
               neighborhood in Microsoft Windows. Please donate me to help \
               in SMBNetFS development."

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=eb723b61539feef013de476e68b5c50a"
HOMEPAGE = "http://sourceforge.net/projects/smbnetfs"

DEPENDS = "fuse samba"
DEPENDS:append:libc-musl = " libexecinfo"

inherit autotools pkgconfig features_check

# samba depends on libpam
REQUIRED_DISTRO_FEATURES = "pam"

PV = "0.6.3"

SRCREV = "736d5e599df3bebce3450125118ac2e70358b0c9"

SRC_URI = "git://smbnetfs.git.sourceforge.net/gitroot/smbnetfs/smbnetfs;branch=master \
           file://configure.patch \
           file://Using-PKG_CHECK_MODULES-to-found-headers-and-libraries.patch"

PACKAGECONFIG ??= ""
PACKAGECONFIG[libsecret] = "--with-libsecret=yes,--with-libsecret=no,libsecret"


LDFLAGS:append:libc-musl = " -lexecinfo"
