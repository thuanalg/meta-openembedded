SUMMARY = "Guess OpenSSL include path"
SECTION = "libs"
HOMEPAGE = "https://metacpan.org/pod/Crypt::OpenSSL::Guess"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea914cc2718e8d53bd7744d96e66c03c"

SRC_URI = "${CPAN_MIRROR}/authors/id/A/AK/AKIYM/Crypt-OpenSSL-Guess-${PV}.tar.gz"

SRC_URI[sha256sum] = "1c5033381819fdb4c9087dd291b90ec70e7810d31d57eade9b388eccfd70386d"

DEPENDS += "openssl"

RDEPENDS:${PN} = "\
    perl-module-config \
    perl-module-exporter \
    perl-module-extutils-mm \
    perl-module-extutils-mm-unix \
    perl-module-file-spec \
    perl-module-symbol \
    perl-module-strict \
    perl-module-warnings \
"

EXTRA_CPANFLAGS = "INC='-I${STAGING_INCDIR}' LIBS='-L${STAGING_LIBDIR} -lssl -L${STAGING_DIR_TARGET}${base_libdir} -lcrypto'"

S = "${UNPACKDIR}/Crypt-OpenSSL-Guess-${PV}"

inherit cpan ptest-perl

BBCLASSEXTEND = "native"

# for backwards compatibility
PROVIDES += "libcrypt-openssl-guess"

RDEPENDS:${PN}-ptest += "\
    perl-module-test-more \
"
